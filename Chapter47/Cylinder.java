public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
    
    public double SA() {
        return  2.0 * Math.PI * radius * radius + 2.0 * Math.PI * radius * height;
    }
}