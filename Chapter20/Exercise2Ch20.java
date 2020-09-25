import java.util.Scanner;
public class Exercise2Ch20 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
        int N = scan.nextInt();
        double sum = 0.0;
        int i = 1;
        while ((i-1)<N) {
            sum = sum + (1.0/i);
            i++;
        }
        System.out.println("Sum is: " + sum);
        scan.close();
    }
}