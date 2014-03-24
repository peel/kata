package java;

import java.util.List;

public class DisplayParser implements Parser {

    public List<Char> parse(String print) {
        Display display = new Displays().getDisplay(print);
        List<Token> tokens = new Tokens().tokenize(display);
        new Tokens().validate(tokens);
        return new Chars().characterize(tokens);
    }

}