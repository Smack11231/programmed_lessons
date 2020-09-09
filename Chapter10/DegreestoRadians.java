public class Example
{  
  public static void main ( String[] args )  
  {
    double degrees = 30;
    double rad = degrees * Math.PI/180;
    double sinx = Math.sin(rad);
    double cosx = Math.cos(rad);
    double sum = sinx * sinx + cosx * cosx;
    System.out.println("Radians: " + rad + " Sine: " + sinx + " Cos: " + cosx + " sum of squares: " + sum );
  }
}