import java.util.Scanner;

public class Exercise1Ch16 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        int purchases, discount;
        System.out.println("Enter amount of purchases: ");
        purchases = scan.nextInt();
        if (purchases > 1000) {
            discount = (purchases*10 - purchases)/10;
            System.out.println("Discounted price: " + discount);
        } else {
            System.out.println("You can't get a discount unless your purchase amount is over $10.00");
        }
    }
}