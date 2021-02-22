import java.util.Scanner;
public class ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();

        if (n < 0){
            System.out.println("n must be a positive number.");
        } else {
            System.out.println(Triangle(n)); 
        }

        scan.close();
    }

    public static int Triangle(int N){
        if ( N == 1 ) {
            return 1;
        } else {
            return N + Triangle( N-1 );
        }
    }
}