import java.util.Scanner;

public class Exercise2Ch21 {
    public static void main ( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper Limit:");
        int N = scan.nextInt();
        scan.close();
        int i = 0;
        int sumsquares = 0, sumcubes = 0;
        while (i<(N+1)) {
            sumsquares += (i*i);
            sumcubes += (i*i*i);
            i++;
        }
        System.out.println("The sum of Squares is " + sumsquares + "\nThe sum of Cubes is " + sumcubes);
    }
}