import java.util.Scanner;

public class Exercise8Ch16 {
	public static void main( String[] args ) {
		Scanner scan = new Scanner(System.in);
		int age, time, cost = 0;
		System.out.println("Enter age: ");
		age = scan.nextInt();
		System.out.println("Enter time: ");
		time = scan.nextInt();
		if (age >= 13) {
			if (time >= 1700) {
				cost = 8;
			} else if (time < 1700){
				cost = 5;
			}
		} else if (age < 13) {
			if (time >= 1700) {
				cost = 4;
			} else if (time < 1700) {
				cost = 2;
			}
		}
		System.out.println("Ticket price is $" + cost );
	}

}