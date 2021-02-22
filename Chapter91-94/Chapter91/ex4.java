import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();

        if (n < 0){
            System.out.println("n must be a positive number.");
        } else {
            System.out.println(log(n)); 
        }

        scan.close();
    }

    public static int log(int N){
        if ( N == 1 ) {
            return 1;
        } else {
            return 1+log(N/2);
        } 
    }
}