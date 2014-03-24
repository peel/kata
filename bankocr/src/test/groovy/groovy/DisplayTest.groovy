package groovy


import spock.lang.Specification

class DisplayTest extends Specification{
    static final String PRINT = "    _  _     _  _  _  _  _ \n" +
            "  | _| _||_||_ |_   ||_||_|\n" +
            "  ||_  _|  | _||_|  ||_| _|\n";

    def "given a display string returns a valid display"(){
        setup:
        def expected = new Display("    _  _     _  _  _  _  _ ", "  | _| _||_||_ |_   ||_||_|", "  ||_  _|  | _||_|  ||_| _|");

        when:
        def actual = new Displays().getDisplay(PRINT);

        then:
        actual == expected
    }
}
