import java.util.ArrayList;
import java.util.List;

/**
 * The Stats class
 * @author – v.v.petrusenko1999@gmail.com
 */

public class Stats {

    //contains numbers entered by player
    private static List<String> statsList = new ArrayList<String>();

    /**
     * writeStats method
     * saving player's stats using arraylist and string
     * @param result
     * @param list
     */
    public static void writeStats(String result, List<Integer> list) {
        for(int number : list) {
            result = result + " " + number + " ";
        }
        statsList.add(result);
    }

    /**
     * showStats method
     * show players stats with result
     */
    public static void showStats() {

        List<String> stats = statsList.subList(Math.max(statsList.size() - 3, 0), statsList.size());

        System.out.println("Stats:");
        for(String stat : stats){
            System.out.println(stat);
        }
    }
}
