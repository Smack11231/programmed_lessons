import java.util.Scanner;

public class Exercise3Ch21 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X: ");
        double X = scan.nextDouble();
        System.out.println("Enter N: ");
        int N = scan.nextInt();
        scan.close();
        double power = X, i = 0;
        if (N>0) {
            while (i<(N-1)) {
                power  = power * X;
                i++;
            }
            System.out.println(X + " raised to the power of " + N + " is " + power);
        } else {
            System.out.println("N must be a positive integer.");
        }
    }
}