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
        int diceone = dice.nextInt(max) + 1;
        int dicetwo = dice.nextInt(max) + 1;
        double avgsum = 0, avgrolls = 0, roll4 = 0;

        int i = 0;
        while (i<times) {
            int rolls = 0;
            while (diceone!=1 && dicetwo!=1) {
                avgsum += diceone + dicetwo;
                avgrolls += 1;
                diceone = dice.nextInt(max);
                dicetwo = dice.nextInt(max);
                rolls++;
            } 
            diceone = dice.nextInt(max);
            dicetwo = dice.nextInt(max);
            if (rolls > 4) {
                roll4++;
            }
            i++;
        }
        avgrolls /= times;
        avgsum /= times;
        roll4 = (roll4/times)*100;
        System.out.println("You had " + avgrolls + " average rolls and a " + avgsum + " average sum. "  + roll4 + "% were plays that had over four rolls.");
    } 
}