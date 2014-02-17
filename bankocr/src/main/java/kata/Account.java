package kata;

import com.google.common.base.Joiner;

import java.util.List;

/**
* Created by m095445 on 2/17/14.
*/
class Account {
    private final List<Char> number;
    public Account(List<Char> number){
       new Accounts().validate(number);
       this.number = number;
    }
    public String getNumber() {
        return Joiner.on("").join(number);
    }

}
