import java.util.Random;

/**
 * The Computer class
 * @author – v.v.petrusenko1999@gmail.com
 */
public class Computer {

    //contains generated number
    private static int number = 0;

    /**
     * startGame method
     * generates random number 1-21 range
     */
    public static void startGame() {
        number = (int) ((Math.random() * (20 - 1)) + 1);
    }

    /**
     * getNumber method
     * generates random number 1-21 range
     */
    public static int getNumber() {
        return number;
    }
}
