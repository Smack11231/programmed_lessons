import java.util.Scanner;

public class Exercise3Ch12 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        int change;

        System.out.println("How many cents?");
        change = scan.nextInt();
        int dollars = change/100;
        int dollar = change % 100;
        int quarters = dollar/25;
        int quarter = dollar%25;
        int dimes = quarter/10;
        int dime = quarter%10;
        int nickels = dime/5;
        int nickel = dime%5;
        int pennies = nickel;

        System.out.println("Your change is " + dollars +" dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
    }
}