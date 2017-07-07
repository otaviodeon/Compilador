import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Stack;

public class Mostra extends BoolBaseListener {

    Stack<Character> pilha = new Stack<Character>();

    @Override
    public void enterR(BoolParser.RContext ctx) {
        System.out.println("enterR");
    }

    @Override
    public void enterB(BoolParser.BContext ctx) {
        System.out.println("enterB");
    }
    @Override
    public void exitB(BoolParser.BContext ctx) {
        System.out.println("exitB");
    }

    @Override
    public void exitR(BoolParser.RContext ctx) {
        System.out.println("exitR");
    }

    @Override
    public void enterC(BoolParser.CContext ctx) {
        System.out.println("enterC");
    }
    @Override
    public void exitC(BoolParser.CContext ctx) {
        System.out.println("exitC");
    }

    @Override
    public void enterPa(BoolParser.PaContext ctx) {
        System.out.println("enterPa");
    }

    @Override
    public void exitPa(BoolParser.PaContext ctx) {
        System.out.println("exitPa");
    }

    @Override
    public void enterPf(BoolParser.PfContext ctx) {
        System.out.println("enterPf");
    }

    @Override
    public void exitPf(BoolParser.PfContext ctx) {
        System.out.println("exitPf");
    }

	@Override
    public void visitTerminal(TerminalNode node) {
        if (!checkPilha(node.getText().charAt(0)))
            pilha.push(node.getText().charAt(0));
    }

    public void mostraResultado() {
        char auxV = pilha.pop();
        if (!pilha.empty()) {             //ainda pode reduzir
            if (reduzBoolean(auxV, pilha.pop(), pilha.pop()))
                pilha.push('V');
            else pilha.push('F');
            System.out.println(pilha.pop());
        } else {
            pilha.push(auxV);
            System.out.println(pilha.pop());         //so resta um V ou F na pilha; imprime resultado
        }
        //System.out.println(pilha.pop());
    }

    public boolean reduzBoolean(char v1, char op, char v2) {
        if (op == 'e') {
            if (v1 == 'F' || v2 == 'F')             //se operacao for AND e algum operando for falso, exp eh F
                return false;
            else return true;
        }
        else {
            if (v1 == 'V' || v2 == 'V')             //se operacao for OR e algum operando for verdadeiro, exp eh V
                return true;
            else return false;
        }
    }

    public boolean checkPilha(char charLido) {
        if (charLido == 'V' || charLido == 'F') {
                if (!pilha.empty() && (pilha.peek() == 'e' || pilha.peek() == 'o')) {
                    if (reduzBoolean(charLido, pilha.pop(), pilha.pop()))
                        pilha.push('V');
                    else pilha.push('F');
                    return true;                    //reduziu; char lido nao entra na pilha
                }

            else return false;
        }
        else if (charLido == ')') {
            char aux = pilha.pop();
            if (pilha.peek() == '(') {
                pilha.pop();
                pilha.push(aux);
            }
            return true;
        }
        else return false;
    }
}
