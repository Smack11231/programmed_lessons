import java.util.Scanner;
public class Exercise2Ch24 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int N = scan.nextInt();
        scan.close();
        int odd = 0, square = N*N;
        for (int i = 0; i < N; i++) {
            if (i%2==1) {
                odd += i;
            }
        }
        System.out.println("There sum of odd numbers is " + odd + ". N^2 is " + square);
    }
}