import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.regex.Pattern;
import java.util.ArrayList;

public class Mostra extends AutomatoBaseListener {

	ArrayList <Estado> estados = new ArrayList<>();


	@Override
    public void visitTerminal(TerminalNode node) {
        System.out.println("node: " + node.getText().charAt(0));
    }

    public void entrada(String entrada){
		System.out.println("entrada: " + entrada);
    }

	@Override public void enterListaestados(AutomatoParser.ListaestadosContext ctx){
		String estados[] = ctx.getText().split(Pattern.quote(","));
		for (int i=0; i < estados.length; i++){
			this.estados.add(new Estado(estados[i]));
		}
	}

	@Override public void enterEstado(AutomatoParser.EstadoContext ctx) {

		//System.out.println("ctx token: " + ctx.children.get(1).getText());
	}
}
