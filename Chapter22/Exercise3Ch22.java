import java.util.Scanner;

public class Exercise3Ch22 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Low end of range: ");
        int low = scan.nextInt();
        System.out.println("high end of range: ");
        int high = scan.nextInt();
        System.out.println("Enter data: ");
        int data = scan.nextInt();
        int sumin = 0, sumout = 0;
        if (data > high || data < low) {
            sumout += data;
        } else {
            sumin += data;
        }
        while (data > 0) {
            System.out.println("Enter data: ");
            data = scan.nextInt();
            if (data > high || data < low) {
                sumout += data;
            } else {
                sumin += data;
            }
        }
        scan.close();
        System.out.println("Sum of in range values: " + sumin);
        System.out.println("Sum of out range values: " + sumout);
    }
}