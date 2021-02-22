import java.util.Scanner;
public class ex5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();

        if (n < 0){
            System.out.println("n must be a positive number.");
        } else {
            System.out.println(pow(n)); 
        }

        scan.close();
    }

    public static int pow(int N){
        if ( N == 0 ) {
            return 1;
        } else {
            return 2*pow(N-1);
        } 
    }
}
