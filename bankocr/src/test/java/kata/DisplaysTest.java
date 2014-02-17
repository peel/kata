package kata;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created by m095445 on 2/17/14.
 */
public class DisplaysTest {
    public static final String PRINT = "    _  _     _  _  _  _  _ \n" +
            "  | _| _||_||_ |_   ||_||_|\n" +
            "  ||_  _|  | _||_|  ||_| _|\n";

    @Test
    public void givenADisplayStringReturnsAvalidDisplay() {
        Display expected = new Display("    _  _     _  _  _  _  _ ", "  | _| _||_||_ |_   ||_||_|", "  ||_  _|  | _||_|  ||_| _|");
        Display actual = new Displays().getDisplay(PRINT);
        System.out.println(actual.toString());
        System.out.println(expected.toString());
        assertTrue(actual.equals(expected));
    }
}
