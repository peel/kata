package java;

import java.util.ArrayList;
import java.util.List;

public class Tokens{
    private static final int ACCOUNT_NUMBER_LENGTH = 9;

    public List<Token> tokenize(Display display) {
        List<Token> tokens = new ArrayList<Token>();
        for(int i=0; i< display.getLine0().length()/3; i++){
            String char0 = display.getLine0().substring(i * 3, i * 3 + 3);
            String char1 = display.getLine1().substring(i * 3, i * 3 + 3);
            String char2 = display.getLine2().substring(i * 3, i * 3 + 3);
            Token t = new Token(char0, char1, char2);
            tokens.add(t);
        }
        return tokens;
    }

    public void validate(List<Token> tokens) {
        if(tokens.size()!=ACCOUNT_NUMBER_LENGTH){
            throw new IllegalArgumentException("Invalid account number length");
        }
    }
}
