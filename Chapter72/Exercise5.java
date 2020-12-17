import java.util.Scanner;
import java.io.*;

public class Exercise5 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ex5in.txt");
        Scanner scan = new Scanner(file);
        PrintWriter output = new PrintWriter("ex5out.txt");

        while (scan.hasNext()){
            String word = scan.next();
            if (word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("the") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("of") || word.replaceAll("[^a-zA-Z]" , "is").toLowerCase().equals("a") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("to") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("is")){
                output.print("");
            } else {
                output.print(word + " ");
            }
        }

        output.close();
        scan.close();
    }
}