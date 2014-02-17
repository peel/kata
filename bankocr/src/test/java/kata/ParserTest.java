package kata;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Iterables.elementsEqual;
import static junit.framework.Assert.assertTrue;

public class ParserTest {
    private final DisplayParser parser = new DisplayParser();
    public static final String PRINT = "    _  _     _  _  _  _  _ \n" +
            "  | _| _||_||_ |_   ||_||_|\n" +
            "  ||_  _|  | _||_|  ||_| _|\n";

    @Test
    public void givenAValidAccountNumberStringParseIntoACharList() {
        List<Char> chars = parser.parse(PRINT);
        List<Char> expected=Lists.newArrayList(Char.ONE, Char.TWO, Char.THREE,Char.FOUR, Char.FIVE, Char.SIX, Char.SEVEN, Char.EIGHT, Char.NINE);
        assertTrue(elementsEqual(chars, expected));
    }
    @Test(expected = IllegalArgumentException.class)
    public void givenAnInvalidAccountStringParseIntoACharList() {
        List<Char> chars = parser.parse(PRINT);
        List<Char> expected=Lists.newArrayList(Char.THREE,Char.FOUR, Char.FIVE, Char.SIX, Char.SEVEN, Char.EIGHT, Char.NINE);
        assertTrue(elementsEqual(chars, expected));
    }


}
