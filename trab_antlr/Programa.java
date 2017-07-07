import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/*
  *     Para executar, seguir passos dos slides (comandos antlr4, grun, compilar e executar.)
  *     Gramática: Bool.g4
  *     Foram implementadas as 3 partes do enunciado do trabalho.
*/

public class Programa   {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);

        BoolLexer lexer = new BoolLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        BoolParser parser = new BoolParser(tokens);
        ParseTree tree = parser.r(); // iniciamos o parsing pela regra init
        System.out.println(tree.toStringTree(parser)); // print arvore

        ParseTreeWalker walker = new ParseTreeWalker();
        Mostra mostra = new Mostra();
        walker.walk(mostra, tree);
        System.out.println(); // insere uma quebra de linha depois da tradução

        System.out.print("Resultado: ");
        mostra.mostraResultado();
    }
}
