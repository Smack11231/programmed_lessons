public class Class_2 extends Class_1 {
    private int z;
 
    //x = 0, y = 0, z = 0
    public Class_2() {
       super();
    }
 
    //x = x1, y = y1, z = z1
    public Class_2(int x1, int y1, int z1) {
       super(x1, y1);
       z = z1;
    }
 
    //output x, y, z
    public void print() {
       System.out.println(super.toString() + z);
    }
 
    public String toString() {
       return super.toString() + z;
    }
 
    //x = x1, y = y1, z = z1
    public void set(int x1, int y1, int z1) {
       super.set(x1,y1);
       z = z1;
    }
 }
 
 