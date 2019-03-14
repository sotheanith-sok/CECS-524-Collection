import java.io.IOException;

import lab4.lab4Lexer;
import lab4.lab4Parser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;


public class Main {

    public static void main(String[] args) throws IOException, RecognitionException {
        lab4.lab4Lexer lexer = new lab4Lexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        lab4.lab4Parser parser = new lab4Parser(tokens);
        parser.program();

    }
}
