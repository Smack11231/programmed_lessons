import java.util.Scanner;

public class Exercise1Ch17 {
	public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        double price, delivery, total, deliveryy = 0.0;
        System.out.println("Enter the item: ");
        String meal = scan.nextLine();
        System.out.println("Enter the price: ");
        price = scan.nextDouble();
        System.out.println("Overnight delivery (0==no, 1==yes): ");
        delivery = scan.nextInt();
        if (price >= 10) {
            deliveryy = 0.0; 
        } else if (price < 10) {
            deliveryy = 2.00;
        }
        if (delivery == 1) {
            deliveryy = deliveryy + 3.00; 
        }
        total = deliveryy + price;
        System.out.println("Invoice:\n\t" + meal + ": " + price + "\n\tdelivery: " + deliveryy + "\n\ttotal cost: " + total);
    }
}