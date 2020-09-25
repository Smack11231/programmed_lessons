import java.util.Scanner;
public class Exercise3Ch19 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter low: ");
        int low = scan.nextInt();
        System.out.println("Enter high: ");
        int high = scan.nextInt();
        int count = low + 1;
        while (count<=high) {
            low = low + count;
            count ++;
        }
        System.out.println("Sum = " + low);
        scan.close();
    }
}