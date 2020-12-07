import java.util.Scanner;

public class Exercise2Ch54{

    public static boolean isSafe(long num) {
        String remainder = String.valueOf(num);
        return remainder.contains("13");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        long num = scan.nextLong();

		if( isSafe( num ) ) {
			System.out.println( num + " is unlucky" );
		}
		else {
			System.out.println( num + " is safe" );
        }
        
        scan.close();
    }
}