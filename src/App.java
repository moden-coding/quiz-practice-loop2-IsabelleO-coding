/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. Keep track of the highest and lowest test score. When the user enters '-1', print out
 *  the highest and lowest scores with an appropriate message i.e. "The high score was ...."
 */


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int highest = 0;
        int lowest = 100000;
        int previous = 0;
        while (true) {
            int score = Integer.valueOf(scanner.nextLine());
            if (score == -1) {
                break;
            } else if (score>highest) {
                highest = score;
            } else if (score<lowest) {
                lowest = score;
            }
        } 
        System.out.println("The high score was " + highest + " and the low score was " + lowest);
    }
}
