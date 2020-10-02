import java.util.Scanner;

public class Exercise2Ch23 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Monthly payment: ");
        int pay = scan.nextInt();
        scan.close();
        double debt = 1000;
        int month = 1, totalpayments = pay;
        double interest = 0;
        while (debt > 0) {
            interest = 0.015 * debt;
            debt = (debt - pay) + interest;
            System.out.println("Month: " + month + "\tBalance: " + debt + "\tTotal payments: " + totalpayments);
            totalpayments += pay;
            month ++;
        }
    }
}