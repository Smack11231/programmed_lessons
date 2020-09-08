public class Example
{  
  public static void main ( String[] args )  
  {
    long hoursWorked;    
    double payRate, taxRate;
    hoursWorked = 40;
    payRate = 10.0;
    taxRate = 0.10;
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}

// the problem was detected when the program tried to execute the section of code that requires the amount stored in the variable that was missing its initialization.