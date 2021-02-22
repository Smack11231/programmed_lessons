import java.util.Scanner;
public class ex6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();

        if (n < 0){
            System.out.println("n must be a positive number.");
        } else {
            System.out.println(pentagonal(n)); 
        }

        scan.close();
    }

    public static int pentagonal(int N){
        if ( N == 1 ) {
            return 1;
        } else {
            return (3 * N * (N-1)) / 2 + N;
        } 
    }
}
