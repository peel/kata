package groovy

import java.Chars

class DisplayParser implements Parser {
    def parse(print){
        def display = new Displays().getDisplay(print);
        def tokens = new Tokens().tokenize(display);
        new Tokens().validate(tokens);
        new Chars().characterize(tokens);
    }
}
