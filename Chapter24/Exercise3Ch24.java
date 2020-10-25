import java.util.Scanner;
public class Exercise3Ch24 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int N = scan.nextInt();
        scan.close();
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }

        System.out.print("The sum is " + sum + ".");
        if (sum == N) System.out.print(" It is a perfect number.");
    }
}