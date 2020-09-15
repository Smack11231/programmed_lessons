import java.util.Scanner;

public class Exercise4Ch13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x;
		double y;
		System.out.println("Enter X: ");
		x = scan.nextDouble();
		System.out.println("Enter Y: ");
		y = scan.nextDouble();
		double arithmean = (x + y) / 2.0;
		double harmean = 2 / ((1 / x) + (1 / y));
		System.out.println("Arithmetic mean: " + arithmean);
		System.out.println("Harmonic mean: " + harmean);
	}

}