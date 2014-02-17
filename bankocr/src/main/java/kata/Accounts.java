package kata;

import java.util.List;

public class Accounts {
    public static final int CHECKSUM_SALT = 11;

    public void validate(List<Char> number) {
        int checksum = calculateChecksum(number);
        if(checksum%CHECKSUM_SALT!=0){
            throw new IllegalArgumentException(String.format("Account number checksum invalid: %s", checksum));
        }
    }
    private int calculateChecksum(List<Char> accountNumber) {
        int checksum=0;
        for(int i=0; i<accountNumber.size(); i++){
            checksum+=accountNumber.get(i).getValue()*(9-i);
        }
        return checksum;
    }
}
