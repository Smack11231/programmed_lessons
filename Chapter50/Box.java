public class Box {
    private double height;
    private double width;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    Box (double side) {
        this.width = side;
        this.length = side;
        this.height = side;
    }

    public Box(Box oldbox) {
        Box newbox = new Box(this.width, this.height, this.length);
    }
    
    public double volume() {
        return length * width * height;
    }
    
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea(); 
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double length() {
        return length;
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return width * length;
    }

    private double sideArea() {
        return length * height;
    }

    public static Box biggerBox( Box oldBox ) {
        return new Box( 1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }

    public static Box smallerBox( Box oldBox ) {
        return new Box( 0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }

    public boolean nests( Box outsideBox ) {
        if (outsideBox.width() < width() && outsideBox.height() < height() && outsideBox.length() < length()) {
            return true;
        } else {
            return false;
        }
    }
}