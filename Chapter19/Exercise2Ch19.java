import java.util.Scanner;
public class Exercise2Ch19 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = scan.nextInt();
        int sum = 0;
        int count = 0;
        while (count<=N) {
            sum = sum + count;
            count ++;
        }
        System.out.println(sum);
    }
}