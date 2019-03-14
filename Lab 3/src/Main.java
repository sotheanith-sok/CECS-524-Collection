import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class Main {

    public static void main(String[] args) {
        try{
            ExprLexer lexer = new ExprLexer(new ANTLRFileStream(args[0]));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            parser.prog();
        }catch (IOException e){
            System.out.println(e);
        }catch (RecognitionException f){
            System.out.println(f);
        }
    }
}
