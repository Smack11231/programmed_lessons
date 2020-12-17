
import java.util.Scanner;
import java.io.*;

public class Exercise6 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ex6in.txt");
        Scanner scan = new Scanner(file);
        PrintWriter output = new PrintWriter("ex6out.txt");

        while (scan.hasNext()){
            String email = scan.next();
            if (email.indexOf("@") > 0 && email.substring(email.indexOf("@")).contains(".")){
                output.println(email);
            } else {
                output.print("");
            }
        }

        output.close();
        scan.close();
    }
}