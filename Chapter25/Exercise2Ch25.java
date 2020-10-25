import java.util.Scanner;
public class Exercise2Ch25 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of guests:");
        int n = scan.nextInt();
        double probability = 100.0;
        for (int i = 1; i < n; i++) {
            probability *= (365-(double)i)/365;
        }
        System.out.println("The probabilitiy that none share a birthday is " + probability + "%");
        if (probability >50)System.out.println("There is a greater than 50% chance that they won't have the same birthday.");
    }
}