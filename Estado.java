import java.util.HashMap;

public class Estado {

    private HashMap<Character, String> transições;

    private String numero_estado;

    private boolean ehFinal;

    public Estado (String n){
        this.numero_estado = n;
        this.transições = new HashMap<>();
    }

    public String getNumEstado(){
        return this.numero_estado;
    }

    public void setFinal (boolean fim){
        this.ehFinal = fim;
    }

    public boolean ehFinal(){
        return this.ehFinal;
    }


    public void setTransição (String estado, Character valor){
        if (this.transições.get(valor) != null){
            System.out.println("Estado já possui uma transição com o mesmo valor " + valor + "! Este autômato é não-determinístico");
            System.out.println ("Esta transição " + this.numero_estado + "," + valor + " -> " + estado + " será desconsiderada.");
            return;
        }
        this.transições.put(valor, estado);
    }

    public String getTransicao(char entrada){
        return this.transições.get(entrada);
    }
}
