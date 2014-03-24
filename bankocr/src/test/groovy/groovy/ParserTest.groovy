package groovy

import com.google.common.collect.Lists
import java.Char
import spock.lang.Specification

class ParserTest extends Specification {
    static final DisplayParser parser = new DisplayParser();
    static final String PRINT = "    _  _     _  _  _  _  _ \n" +
            "  | _| _||_||_ |_   ||_||_|\n" +
            "  ||_  _|  | _||_|  ||_| _|\n";
    static final String INVALID_PRINT = "\n\n\n";

    def "given A Valid Account Number String Parse Into A Char List"() {
        when:
        def chars = parser.parse(PRINT);
        def expected=Lists.newArrayList(Char.ONE, Char.TWO, Char.THREE,Char.FOUR, Char.FIVE, Char.SIX, Char.SEVEN, Char.EIGHT, Char.NINE);

        then:
        chars == expected
    }
    def void "given An Invalid Account String Parse Into A Char List"() {
        when:
        parser.parse(INVALID_PRINT);

        then:
        thrown IllegalArgumentException
    }
}
