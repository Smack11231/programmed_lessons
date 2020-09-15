import java.util.Scanner;

public class Exercise2Ch12 {
    public static void main ( String[] args ) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Input the cents: ");
		int cents = scan.nextInt();

		int dollars = cents / 100;
		int remainder = cents % 100;

		System.out.println("That is " + dollars + " dollars and " + remainder + " cents.");
    }
}