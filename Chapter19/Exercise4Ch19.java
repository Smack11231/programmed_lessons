import java.util.Scanner;
public class Exercise4Ch19 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();
        int times = word.length();
        int i = 0;
        while (i<times) {
            System.out.println(word);
            i++;
        }
        scan.close();
    }
}