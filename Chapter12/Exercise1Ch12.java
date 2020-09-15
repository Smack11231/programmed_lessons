public class Exercise1Ch12 {
    public static void main ( String[] args) {
        java.util.Scanner circle = new java.util.Scanner( System.in);
        System.out.println("What is the radius of the circle?");
        int rad = circle.nextInt();
        double area = Math.PI * rad * rad;
        System.out.println("The radius is " + rad + ". The area is " + area + ".");
    }
}