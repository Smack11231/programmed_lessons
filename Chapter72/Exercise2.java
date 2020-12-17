import java.util.Scanner;
import java.io.*;

public class Exercise2 {
  public static void main (String[] args) throws IOException { 
    File file = new File("ex2.txt");
    Scanner scan = new Scanner( file );
    int sum = 0, sumSQ = 0, i = 0;

    while( scan.hasNextDouble() ) {
      double num = scan.nextDouble();
      sum += num;
      i++;
      sumSQ += (num*num);
    }

    double avg = sum / i;
    double avgSQ = sumSQ / i;
    double var = avgSQ - (avg*avg);
    double sd = Math.pow(var,0.5);

    System.out.println("The average is " + avg + ", the standard deviation is " + sd);
    scan.close();
  }
}