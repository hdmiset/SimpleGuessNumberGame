import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The Player class
 * @author – v.v.petrusenko1999@gmail.com
 */
public class Player {

    //scanner, used to scan entered numbers
    private static Scanner sc = new Scanner(System.in);
    //guess field, contain guess number of player
    private static int guess = 0;
    //number field, contains random number
    private static int number = 0;

    /**
     * guessNumber method
     * checks the entered number for the match
     */
    public void guessNumber(){

        List<Integer> list = new ArrayList<Integer>();
        String result = "";
        int attempts = 3;
        number = Computer.getNumber();

        while(attempts!=0) {
            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); // checks for only int value input
            }
            guess = sc.nextInt();
            if (guess == number) {
                list.add(guess);
                System.out.println("Congratulations");
                result = result + "success";
                break;
            } else {
                list.add(guess);
                attempts--;
                System.out.println("failure, you have " + attempts + " attempts left");
                if (attempts == 0) {
                    System.out.println("You failed");
                    result = result + "failure";
                    break;
                }
            }
        }
            //write and save stats
            Stats.writeStats(result, list);
    }
}
