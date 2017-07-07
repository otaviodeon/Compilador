import java.util.HashMap;

public class Estado {

    private HashMap<String, Character> transições;

    private String numero_estado;

    private boolean ehInicial, ehFinal;

    public Estado (String n){
        this.numero_estado = n;
        this.transições = new HashMap<String, Character>();
    }

    public void setInicial(boolean inicial){
        this.ehInicial = inicial;
    }

    public void setFinal (boolean fim){
        this.ehFinal = fim;
    }

    public void setTransição (String estado, Character valor){
        this.transições.put(estado, valor);
    }
}
