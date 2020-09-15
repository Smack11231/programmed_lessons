import java.util.Scanner;
public class Exercise4Ch12 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
		int volt, res;
		System.out.println("How many volts?");
		volt = scan.nextInt();
		System.out.println("What's the resistance?");
		res = scan.nextInt();
		double current = (volt + 0.0) / res;
		System.out.println("The current is " + current);
    }
}