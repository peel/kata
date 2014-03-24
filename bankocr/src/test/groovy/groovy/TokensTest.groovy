package groovy

import spock.lang.Specification

class TokensTest extends Specification{
    def "given a valid string return tokenized collection"(){
        setup:
        Display display = new Display("    _  _     _  _  _  _  _ ", "  | _| _||_||_ |_   ||_||_|", "  ||_  _|  | _||_|  ||_| _|");

        when:
        List<Token> actual = new Tokens().tokenize(display);

        then:
        actual.contains(new Token("   ", "  |", "  |"));
    }

    def "given an invalid display string throws an error"(){
        setup:
        List<Token> actual = []

        when:
        new Tokens().validate(actual)

        then:
        IllegalArgumentException ex = thrown()
        ex.message=="Invalid account number length"
    }
}