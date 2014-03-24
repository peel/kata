package groovy

class Tokens {
    static final ACCOUNT_NUMBER_LENGTH=9;

    def tokenize(display) {
        List<Token> tokens = []
        int count = display.getLine0().length()/3
        (0..<count).each{
          def char0=display.getLine0().substring(it*3,it*3+3)
          def char1=display.getLine1().substring(it*3,it*3+3)
          def char2=display.getLine2().substring(it*3,it*3+3)
          def token = new Token(char0, char1, char2);
          tokens.add(token)
        }
        tokens
    }

    def validate(tokens){
        if(tokens.size()!=ACCOUNT_NUMBER_LENGTH){
            throw new IllegalArgumentException("Invalid account number length");
        }
    }
}
