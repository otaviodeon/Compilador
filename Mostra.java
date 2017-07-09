import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.HashMap;

public class Mostra extends AutomatoBaseListener {

	HashMap <String, Estado> estados;

	Estado estado_inicial;

	ArrayList <Character> alfabeto;

	boolean abort = false;

	public Mostra (){
		this.alfabeto = new ArrayList<>();
		this.estados = new HashMap<>();
	}


    public void entrada(String entrada){
		if (abort == false){
			executarAutomato(entrada);
		}
		else {
			System.out.println("Automato inválido!");
		}
    }

    private void executarAutomato(String entrada){

    	String aux_entrada = entrada;
    	Estado estado_atual = estado_inicial;

    	while (entrada.length() > 0){
    		char valor = entrada.charAt(0);
    		entrada = entrada.substring(1);
    		String proximo_estado = estado_atual.getTransicao(valor);
    		if (proximo_estado != null){
    			Estado estado = this.estados.get(proximo_estado);
    			if (estado != null){
    				System.out.println (estado_atual.getNumEstado() + ", " + valor + " -> " + estado.getNumEstado());
    				estado_atual = estado;
    			}
    			else {
    				System.out.println ("ERRO! Estado da transição " + estado_atual.getNumEstado() + ", " + valor + " não existe!"); 
    				return;
    			}
    		}
    		else {
    			System.out.println("ERRO! Estado " + estado_atual.getNumEstado() + " não possui transição com o valor " + valor);
    			System.out.println("Entrada inválida");
    			return;
    		}
    	}
    	if (estado_atual.ehFinal()){
    		System.out.println ("Entrada " + aux_entrada + " válida! Estado final: " + estado_atual.getNumEstado());
    	}
    	else {
    		System.out.println("Estado atual não é final. Entrada inválida para o autômato!");
    	}
    }


    /*
	Adiciona os estados definidos pelo usuário a uma lista de estados. Exemplo: [q1, q2, q3]
    */
	@Override public void enterListaestados(AutomatoParser.ListaestadosContext ctx){
		String estados[] = ctx.getText().split(Pattern.quote(","));
		for (int i=0; i < estados.length; i++){
			this.estados.put(estados[i], new Estado(estados[i]));
		}
	}


	@Override public void enterAlfabeto(AutomatoParser.AlfabetoContext ctx) {
		String lista_alfabeto[] = ctx.getText().split(Pattern.quote(","));

		for (int i=0; i < lista_alfabeto.length; i++){
			this.alfabeto.add(lista_alfabeto[i].charAt(0));
		}
	}

	@Override public void enterEntrada(AutomatoParser.EntradaContext ctx) {
		this.entrada(ctx.getText());
	}



	@Override public void enterTransicao(AutomatoParser.TransicaoContext ctx) { 
		String transicoes = ctx.getText();
		transicoes = transicoes.replaceAll(" ", "");

		while (!transicoes.equals("")){

			//remove primeiro caracter "("
			transicoes = transicoes.substring(1);
			String[] partes = transicoes.split(",");

			String estado1 = partes[0];

			transicoes = transicoes.replaceFirst(estado1 + ",", "");

			partes = transicoes.split("\\)");

			char letra = partes[0].charAt(0);
			

			transicoes = transicoes.replaceFirst(partes[0] + "\\)", "");
			
			transicoes = transicoes.replaceFirst("->", "");
			
			if (this.estaNoAlfabeto(letra)){
				partes = transicoes.split(",");
				String estado2 = partes[0];
				transicoes = transicoes.replaceFirst(partes[0], "");
				transicoes = transicoes.replaceFirst(",", "");
				this.adicionaTransicao(estado1, letra, estado2);
				
			}
			else {
				System.out.println("ERRO! O caracter " + letra + " não está no alfabeto.");	
				this.abort = true;
				return;
			}

		}
	}

	@Override public void enterInicial(AutomatoParser.InicialContext ctx) { 
		String estado_inicial = ctx.getText();
		
		this.estado_inicial = this.estados.get(estado_inicial);

		if (this.estado_inicial == null){
			System.out.println("ERRO! Estado inicial " + estado_inicial + " não existe!");
			this.abort = true;
		}
	}


	@Override public void enterFinais(AutomatoParser.FinaisContext ctx) {
		String estados[] = ctx.getText().split(Pattern.quote(","));

		for (int i=0; i < estados.length; i++){
			Estado estado = this.estados.get(estados[i]);

			if (estado != null){
				estado.setFinal(true);
			}
			else {
				this.abort = true;
				System.out.println("ERRO! Estado final " + estados[i] + " não existe!");
				return;
			}
		}

	}

	private void adicionaTransicao (String estado1, char valor, String estado2){
		Estado estado = this.estados.get(estado1);
		if (estado != null){
			estado.setTransição(estado2, valor);
		}
		else {
			System.out.println("ERRO! Estado " + estado1 + " não existe!");
			this.abort = true;
		}
	}


	private boolean estaNoAlfabeto (char caracter){
		return alfabeto.contains(caracter);
	}

}
