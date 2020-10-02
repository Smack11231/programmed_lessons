import java.util.Scanner;

public class Exercise2Ch22 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Initial miles: (negative to stop)");
        int init = scan.nextInt();
        while (init > 0) {
        System.out.println("Final miles:");
        int last = scan.nextInt();

        System.out.println("Gallons:");
        int gallons = scan.nextInt();
        double mpg = (last - init)/gallons;

        System.out.println("Gallons per mile: " + mpg + "\nInitial miles: (negative to stop)");
        init = scan.nextInt();
        }
        System.out.println("bye");
    }
}