import java.util.Scanner;
public class ex7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();

        if (n < 0){
            System.out.println("n must be a positive number.");
        } else {
            System.out.println(triangleNum(n)); 
        }

        scan.close();
    }

    public static int triangleNum(int N){
        if ( N == 1 ) {
            return 1;
        } else if (N==0) {
            return 0;
        } else {
            return N + Triangle( N-1 );
        } 
    }
}
