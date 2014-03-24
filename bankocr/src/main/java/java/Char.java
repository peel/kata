package java;

/**
* Created by m095445 on 2/17/14.
*/
enum Char {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9);

    private final int i;

    Char(int i) {
      this.i = i;
    }

    public int getValue(){
       return i;
    }
}
