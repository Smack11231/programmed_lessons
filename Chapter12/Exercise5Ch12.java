import java.util.Scanner;
public class Exercise5Ch12 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        String userstring, substring;
        int begind, endind;
        System.out.println("What is the string?");
        userstring = scan.nextLine();
        System.out.println("What is the beginning index?");
        begind = scan.nextInt();
        System.out.println("What is the ending index?");
        endind = scan.nextInt();
        substring = userstring.substring(begind, endind);
        System.out.println("Original string:" + userstring + "Substring:" + substring);
    }
}