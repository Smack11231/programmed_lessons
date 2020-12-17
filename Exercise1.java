import java.util.Scanner;
import java.io.*;

public class GroupAvg{
    public static void main(String[] args) throws FileNotFoundException{
        File file;
        Scanner scan;
        Scanner scan2 = new Scanner(System.in);
        int totsum = 0;

        System.out.println("Enter file name ('quit' to exit)");
        String fileName = scan2.nextLine();
        
        while (!fileName.toLowerCase().equals("quit")){
            file = new File(fileName);
            scan = new Scanner(file);

            int sum = 0;
            int count = 0;

            while (scan.hasNextInt()){
                int nextInt = scan.nextInt();
                count++;
                sum += nextInt;
                totsum += nextInt;
            }

            double avg = sum / count;
            System.out.println("Average: " + avg);

            System.out.println("Enter file name (enter \"quit\" to end)");
            fileName = scan2.nextLine();
        }

        scan2.close();
        System.out.println("Total sum: " + totsum);
    }
}