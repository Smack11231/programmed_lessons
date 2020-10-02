import java.util.Scanner;

public class Exercise4Ch21 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Initial number of stars:");
        int stars = scan.nextInt();
        scan.close();
        while (stars>0) {
            int i = 0;
            while (i < stars) {
                System.out.println("*");
                i ++;
            }
            System.out.println("\n");
            stars--;
        }
    }
}