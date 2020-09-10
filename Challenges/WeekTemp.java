import java.util.Scanner;

import java.util.Scanner;

public class WeekTemp {  
  public static void main ( String[] args )  
  {
    Scanner temp = new Scanner(System.in);
    System.out.println("What is Sunday's temperature?");
    int sun = temp.nextInt(); //.next is the built in ability with the scanner that we imported. Can only hold string info
    System.out.println("What is Monday's temperature?");
    int mon = temp.nextInt();
    System.out.println("What is Tuesday's temperature?");
    int tues = temp.nextInt();
    System.out.println("What is Wednesday's temperature?");
    int wed = temp.nextInt();
    System.out.println("What is Thursday's temperature?");
    int thur = temp.nextInt();
    System.out.println("What is Friday's temperature?");
    int fri = temp.nextInt();
    System.out.println("What is Saturday's temperature?");
    int sat = temp.nextInt();
    int average = (sun + mon + tues + wed + thur + fri + sat) / 7;
    System.out.println("Temperatures: (degrees Farenheight)\nSunday:" + sun + "\nMonday: " + mon + "\nTuesday: " + tues + "\nWednesday: " + wed + "\nThursday: " + thur + "\nFriday: " + fri + "\nSaturday: " + sat + "\nAverage weekly temperature: " + average);
  }
}