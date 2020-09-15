import java.util.Scanner;

public class Exercise3Ch13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x;
		System.out.println("Enter a double: ");
		x = scan.nextDouble();
		double logx = (Math.log(x)) / (Math.log(2));
		System.out.println("Base 2 log of " + x + " is " + logx);
	}

}