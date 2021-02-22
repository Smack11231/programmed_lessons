import java.util.Scanner;
public class ex3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();

        if (n < 0){
            System.out.println("n must be a positive number.");
        } else {
            System.out.println(square(n)); 
        }

        scan.close();
    }

    public static int square(int N){
        if ( N == 1 ) {
            return 1;
        } else {
            return square(N-1) + 2*N -1;
        } 
    }
}