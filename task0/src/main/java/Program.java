import java.util.Scanner;

/**
 * The Program class
 * @author – v.v.petrusenko1999@gmail.com
 */
public class Program {

    //scanner, used to scan entered numbers
    public static Scanner sc = new Scanner(System.in);

    /**
     * main method
     * starts the program
     * @param args
     */
    public static void main(String[] args) {
        Player player = new Player();

        int action = 0;

        //scan number and choose action
        outer:
        while(true) {
            System.out.println("Welcome to the game Guess The Number:");
            System.out.println("---------------------------------");
            System.out.println("1. Start new game\n" +
                    "2. Show history\n" +
                    "3. Exit");

            while (!sc.hasNextInt()) {
                System.out.println("That not a number!");
                sc.next(); // checks for only int value input
            }
            action = sc.nextInt();

            //choose action
            switch(action) {
                case 1:
                    System.out.println("Generated number in range 1-20: ");
                    System.out.println("Guess number (you have 3 attempts): ");
                    Computer.startGame();
                    player.guessNumber();
                    break;
                case 2:
                    Stats.showStats();
                    break;
                case 3:
                    break outer;
            }
        }
    }
}
