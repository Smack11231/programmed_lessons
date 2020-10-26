public class BoxTester {

  public static void main( String[] args )
  {
    Box box = new  Box( 2.5, 5.0, 6.0 ) ;
    System.out.println("Area: "  + box.area() + " volume: " + box.volume());
    Box bigBox = Box.biggerBox(box);
    // System.out.println("Area: "  + bigBox.area() + " volume: " + bigBox.volume());
    Box smallBox = Box.smallerBox(box);
    // System.out.println("Area: "  + smallBox.area() + " volume: " + smallBox.volume());
    System.out.println("first: " + box.nests(bigBox)  + "\nsecond: " + box.nests(smallBox)); 

    // Box box2 = new Box(box);
    // System.out.println("Area: "  + box.area() + " volume: " + box.volume());
    // System.out.println("Area 2: "  + box.area() + " volume 2: " + box.volume());

    // System.out.println("topArea: "  + box.width()*box.length());
    // System.out.println("length: " + box.length() + " height: " + box.height() + " width:  " + box.width());
  }
}