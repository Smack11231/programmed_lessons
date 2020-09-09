public class Example
{  
  public static void main ( String[] args )  
  {
    double x = 3.14159;
    double sinx = Math.sin(x);
    double cosx = Math.cos(x);
    double sum = sinx * sinx + cosx * cosx;
    System.out.println("Sine: " + sinx + " Cos: " + cosx + " sum of squares: " + sum );
  }
}