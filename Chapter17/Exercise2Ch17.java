import java.util.Scanner;

public class Exercise2Ch17 {
	public static void main( String[] args ) {
        Float Tair, Tsteam;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tempterature of air: ");
        Tair = scan.nextFloat();
        System.out.println("Enter tempterature of steam: ");
        Tsteam = scan.nextFloat();
        scan.close();
        Float efficiency = 1 - Tair / Tsteam;
        if (Tsteam < 375) {
            efficiency -= efficiency;
        }
        System.out.println("Maximum efficieny: " + efficiency);
    }
}