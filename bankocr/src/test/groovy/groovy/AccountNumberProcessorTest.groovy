package groovy

import com.google.common.collect.Lists
import spock.lang.Specification

class AccountNumberProcessorTest extends Specification{
    def "given a set of values parse into a valid string" (){
        setup:
        def parser = Mock(Parser)
        parser.parse(_) >> Lists.newArrayList(Char.THREE, Char.FOUR, Char.FIVE,Char.EIGHT, Char.EIGHT, Char.TWO, Char.EIGHT, Char.SIX, Char.FIVE)
        def accountNumber = parser.parse(null)

        when:
        new Accounts().validate(accountNumber)

        then:
        notThrown Exception
    }
    def "given an invalid set of values parse into a valid string"(){
        setup:
        def parser = Mock(Parser)
        parser.parse(_) >> Lists.newArrayList(Char.ONE, Char.ONE, Char.ONE,Char.ONE, Char.ONE, Char.ONE, Char.ONE, Char.ONE, Char.ONE)
        def accountNumber = parser.parse(null)

        when:
        new Accounts().validate(accountNumber)

        then:
        thrown Exception
    }
}
