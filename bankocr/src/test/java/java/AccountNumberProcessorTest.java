package java;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class AccountNumberProcessorTest {
    @Test
    public void givenASetOfValuesParseIntoAValidString() {
        List<Char> accountNumber = new ValidStringParser().parse(null);
        new Account(accountNumber);
    }
    @Test(expected=IllegalArgumentException.class)
    public void givenAnInvalidSetOfValuesParseIntoAValidString() {
        List<Char> accountNumber = new InvalidStringParser().parse(null);
        new Accounts().validate(accountNumber);
    }

    class InvalidStringParser implements Parser{
        @Override
        public List<Char> parse(String print) {
            return Lists.newArrayList(Char.ONE, Char.ONE, Char.ONE,Char.ONE, Char.ONE, Char.ONE, Char.ONE, Char.ONE, Char.ONE);
        }
    }
    class ValidStringParser implements Parser{
        @Override
        public List<Char> parse(String print) {
            return Lists.newArrayList(Char.THREE, Char.FOUR, Char.FIVE,Char.EIGHT, Char.EIGHT, Char.TWO, Char.EIGHT, Char.SIX, Char.FIVE);
        }
    }
}
