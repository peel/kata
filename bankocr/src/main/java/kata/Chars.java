package kata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m095445 on 2/17/14.
 */
public class Chars{
    public List<Char> characterize(List<Token> tokens) {
        List<Char> characters = new ArrayList<Char>();
        for(Token t: tokens){
            characters.add(getCharFrom(t));
        }
        return characters;
    }
    public Char getCharFrom(Token token){
        if(token.getLine0().equals("   ") && token.getLine1().equals("  |") && token.getLine2().equals("  |")){
            return Char.ONE;
        }else if(token.getLine0().equals(" _ ") && token.getLine1().equals(" _|") && token.getLine2().equals("|_ ")){
            return Char.TWO;
        }else if(token.getLine0().equals(" _ ")&& token.getLine1().equals(" _|")&& token.getLine2().equals(" _|")){
            return Char.THREE;
        }else if(token.getLine0().equals("   ")&& token.getLine1().equals("|_|")&& token.getLine2().equals("  |")){
            return Char.FOUR;
        }else if(token.getLine0().equals(" _ ")&& token.getLine1().equals("|_ ")&& token.getLine2().equals(" _|")){
            return Char.FIVE;
        }else if(token.getLine0().equals(" _ ")&& token.getLine1().equals("|_ ")&& token.getLine2().equals("|_|")){
            return Char.SIX;
        }else if(token.getLine0().equals(" _ ")&& token.getLine1().equals("  |")&& token.getLine2().equals("  |")){
            return Char.SEVEN;
        }else if(token.getLine0().equals(" _ ")&& token.getLine1().equals("|_|")&& token.getLine2().equals("|_|")){
            return Char.EIGHT;
        }else if(token.getLine0().equals(" _ ")&& token.getLine1().equals("|_|")&& token.getLine2().equals(" _|")){
            return Char.NINE;
        }else if(token.getLine0().equals(" _ ")&& token.getLine1().equals("| |")&& token.getLine2().equals("|_|")){
            return Char.ZERO;
        }else{
            throw new IllegalStateException("Not a char");
        }

    }

}
