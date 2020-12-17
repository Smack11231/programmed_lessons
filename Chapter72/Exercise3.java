import java.util.Scanner;
import java.io.*;

public class Exercise3 {
  public static void main (String[] args) throws IOException, FileNotFoundException { 
    File file;
    Scanner scan = new Scanner(System.in);

    PrintWriter neg;
    PrintWriter pos;

    System.out.println("Enter input file:");
    String inputs = scan.nextLine();
    System.out.println("Enter negative file:");
    String negFile = scan.nextLine();
    System.out.println("Enter positive file:");
    String posFile = scan.nextLine();

    file = new File(inputs);
    scan = new Scanner(file);
    neg = new PrintWriter(negFile);
    pos = new PrintWriter(posFile);

    while (scan.hasNextInt()){
      int nextInt = scan.nextInt();

      if (nextInt < 0){
          neg.println(nextInt);
      } else {
          pos.println(nextInt);
      }
    }

    scan.close();
    neg.close();
    pos.close();

  }
}