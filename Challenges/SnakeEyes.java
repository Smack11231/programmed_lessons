import java.util.Scanner;
import java.util.Random;

public class SnakeEyes {
    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);
        Random dice1 = new Random();
        Random dice2 = new Random();
        System.out.println("How many times do you want the program to run?");
        int times = scan.nextInt();
        scan.close();
        int max = 5;
        int diceone = dice1.nextInt(max);
        int dicetwo = dice2.nextInt(max);
        int sum = 0, avgsum = 0, avgrolls = 0, roll4 = 0;
        while (times>0) {
            while (!(diceone == 0) && !(dicetwo==0)) {
                sum = diceone + dicetwo + 2; // + 2 is  because the min is 0 and the 0 is worth a 1.
                avgsum += sum;
                avgrolls ++;
            } 
            times --;
            if (avgrolls > 4) {
                roll4 ++;
            }
        }
        avgrolls = avgrolls / times;
        avgsum = avgsum / times;
        System.out.println("You had " + avgrolls + " average rolls and a " + avgsum + " average sum. "  + roll4 + " were plays that had over four rolls.");
    } 
}