import java.util.Scanner;
import java.io.*;

public class Exercise4 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ex4.txt");
        Scanner scan = new Scanner(file);
        int xsum = 0, ysum = 0;

        while (scan.hasNext()){
            String nextStr = scan.nextLine();
            if (nextStr.substring(0,3).equals("x= ")){
                xsum += Integer.parseInt(nextStr.substring(3));
            } else if (nextStr.substring(0,3).equals("y= ")) {
                ysum += Integer.parseInt(nextStr.substring(3));
            }
        }

        System.out.println("x sum: " + xsum);
        System.out.println("y sum: " + ysum);
        scan.close();
    }
}