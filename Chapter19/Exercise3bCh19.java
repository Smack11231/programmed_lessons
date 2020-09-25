import java.util.Scanner;
public class Exercise3bCh19 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word = scan.next();
        System.out.println("Enter first word: ");
        String word2 = scan.next();
        int dots = 30 - word.length() - word2.length();
        int i = 0;
        System.out.println(word);
        while (i<dots) {
            System.out.print(".");
            i++;
        }
        System.out.println(word2);
        scan.close();
    }
}