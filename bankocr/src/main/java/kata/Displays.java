package kata;

import java.util.Scanner;

/**
 * Created by m095445 on 2/17/14.
 */
public class Displays{
    public Display getDisplay(String print) {
        Scanner s = new Scanner(print);
        String line0 = s.nextLine();
        String line1 = s.nextLine();
        String line2 = s.nextLine();

        return new Display(line0, line1, line2);
    }
}