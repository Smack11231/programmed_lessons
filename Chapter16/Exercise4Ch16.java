import java.util.Scanner;

public class Exercise4Ch16 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight;
        System.out.println("Enter your weight: ");
        weight = scan.nextInt();
        if (weight<280 && weight>220) {
            System.out.println("You're good to go!");
        } else {
            System.out.println("Sorry, you do not fit the weight criteria.");
        }
    }
}