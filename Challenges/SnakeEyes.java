import java.util.Scanner;
import java.util.Random;

public class SnakeEyes {
    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);
        Random dice = new Random();
        System.out.println("How many times do you want the program to run?");
        int times = scan.nextInt();
        scan.close();

        int max = 6;
        int diceone = dice.nextInt(max);
        int dicetwo = dice.nextInt(max);
        int sum = 0;
        double avgsum = 0, avgrolls = 0, roll5 = 0;

        int i = 0;
        while (i<times) {
            while (diceone!=0 && dicetwo!=0) {
                sum = diceone + dicetwo + 2; // + 2 is  because the min is 0 and the 0 is worth a 1.
                avgsum += sum;
                avgrolls += 1;
                diceone = dice.nextInt(max);
                dicetwo = dice.nextInt(max);
            } 
            i++;
            if (avgrolls > 4) {
                roll5++;
            }
        }
        avgrolls = avgrolls / times;
        avgsum = avgsum / times;
        roll5 = (roll5/times)*100;
        System.out.println("You had " + avgrolls + " average rolls and a " + avgsum + " average sum. "  + roll5 + "% were plays that had over four rolls.");
    } 
}