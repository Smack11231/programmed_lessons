import java.util.Scanner;

public class Exercise2Ch16 {
    public static void main( String[] args ) {
        final int bolt,nut,washer;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many bolts?");
        bolt = scan.nextInt();
        System.out.println("How many nuts?");
        nut = scan.nextInt();
        System.out.println("How many washers?");
        washer = scan.nextInt();
        final int cost = 5*bolt + nut*3 +washer;
        if (nut<bolt && !(washer<(2*bolt))) {
            System.out.println("Check the order: too few nuts.");
        } else if (washer<(2*bolt) && !(nut<bolt)){
            System.out.println("Check the order: too few washers.");
        } else if (nut<bolt && washer<(2*bolt)) {
            System.out.println("Check the order: Too bew washers and bolts.");
        } else {
            System.out.println("Order is OK.");
         }
        System.out.println("Total cost: " + cost);
    }
}