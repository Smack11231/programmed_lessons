import java.util.Scanner;
public class Exercise4bCh19 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter word: ");
        String word = scan.next();
        int i = 0;
        int times = word.length();
		while (i < times) {
            System.out.println(word.charAt(i));
            i++;
		}
        scan.close();
    }
}