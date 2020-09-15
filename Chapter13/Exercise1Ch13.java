import java.util.Scanner;

public class Exercise1Ch13 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        double kwh, kwhpy, annualcost;
        System.out.println("Enter the kilo-watt hours cost: ");
        kwh = scan.nextDouble();
        System.out.println("Enter kilo-watt hours used per year: ");
        kwhpy = scan.nextDouble();
        annualcost = kwhpy*(kwh/100);
        System.out.println("Annual cost: " + annualcost);
    }
}