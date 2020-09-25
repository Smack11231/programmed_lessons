import java.util.Scanner;
public class Exercise3Ch20 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
        int N = scan.nextInt();
        float SD = 0;
        float average = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter integer");
            float number = scan.nextFloat();
            average += number;
            SD += (number*number);
        }
        average = average / N;
        SD = SD / N;
        SD = (float) Math.sqrt(SD - average*average);
        System.out.println("Average is: " + average);
        System.out.println("Standard Deviation is: " + SD);
        scan.close();
    }
}