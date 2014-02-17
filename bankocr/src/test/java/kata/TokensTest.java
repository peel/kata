package kata;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class TokensTest {
    @Test
    public void givenAValidStringReturnsTokenizedCollection() {
       Display display = new Display("    _  _     _  _  _  _  _ ", "  | _| _||_||_ |_   ||_||_|", "  ||_  _|  | _||_|  ||_| _|");
       List<Token> actual = new Tokens().tokenize(display);
       assertThat(actual, CoreMatchers.hasItem(new Token("   ","  |","  |")));
    }
}
