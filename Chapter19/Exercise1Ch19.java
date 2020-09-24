import java.util.Scanner;
public class Exercise1Ch19 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = scan.nextInt();
        System.out.println("Enter end: ");
        int end = scan.nextInt();
        while ((end+1) > start) {
            System.out.println(start);
            start ++;
        }
    }
}