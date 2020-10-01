import java.util.Scanner;

public class Exercise1Ch21 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter departure time of flight: ");
        double depart = scan.nextInt();
        System.out.println("Enter arrival time: ");
        double arrive = scan.nextInt();
        System.out.println("Enter zones crossed: ");
        double zones = scan.nextInt();
        System.out.println("Number of hours traveled: ");
        double duration = scan.nextInt();
        scan.close();
        double departdays = 0, arrivedays = 0;
        if (depart >= 8 && depart < 12) {
            departdays = 0;
        } else if (depart >= 12 && depart < 18) {
            departdays = 1;
        } else if (depart >= 18 && depart < 22) {
            departdays = 3;
        } else if (depart >= 22 && depart < 24) {
            departdays = 4;
        } else if (depart < 1) {
            departdays = 4;
        } else if (depart >= 1 && depart < 8) {
            departdays = 5;
        }
        if (arrive >= 8 && arrive < 12) {
            arrivedays = 4;
        } else if (arrive >= 12 && arrive < 18) {
            arrivedays = 2;
        } else if (arrive >= 18 && arrive < 22) {
            arrivedays = 0;
        } else if (arrive >= 22 && arrive < 24) {
            arrivedays = 1;
        } else if (arrive < 1) {
            arrivedays = 1;
        } else if (arrive >= 1 && arrive < 8) {
            arrivedays = 3;
        }
        double days = (duration/2 + (zones-3) + departdays + arrivedays)/10;
        System.out.println("You will need " + days + " days to recover from jetlag.");
    }
}