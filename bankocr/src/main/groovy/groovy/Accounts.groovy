package groovy

class Accounts {
    static final CHECKSUM_SALT = 11

    def validate(number) {
        def checksum = calculateChecksum(number)
        if(checksum%CHECKSUM_SALT!=0){
            throw new IllegalArgumentException("Account number checksum invalid: $checksum")
        }
    }
    def calculateChecksum(accountNumber) {
        def checksum=0
        (0..<accountNumber.size).each{
           checksum+=accountNumber.get(it).value*(9-it)
        }
        checksum
    }

}
