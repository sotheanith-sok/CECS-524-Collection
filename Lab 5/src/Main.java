import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws RecognitionException, IOException {

        lab5Lexer lexer = new lab5Lexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        lab5Parser parser = new lab5Parser(tokens);
        parser.program();
    }
}
