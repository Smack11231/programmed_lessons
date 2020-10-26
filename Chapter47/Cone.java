public class Cone {
    private double height;
    private double radius;

    public Cone(double radius2, double height2){
        this.radius = radius2;
        this.height = height2;
    }
    public double area(){
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }
    public double volume(){
        return Math.PI * radius * radius * height / 3.0;
    }

    public double slantHeight(){
        return Math.sqrt(radius*radius + height*height);
    }
    public double angle(){
        return Math.atan(radius/height);
    }
}