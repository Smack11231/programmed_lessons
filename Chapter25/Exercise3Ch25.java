public class Exercise3Ch25 {
    public static void main( String[] args ) {
        int upper = 10000;
        int lower = 0;
        boolean square = false, triangle = false;
        int test = 0;
        for(int i = 1; i <= upper; i++) {
            for (int j = 0; j < upper; j++) {
                if (j*j == i) {
                    square = true;
                }
            }
            for( int h = 0; h <= upper; h++ ) {
                test += h;
                if( test == i ) triangle = true;
            }
            if (square && triangle) {
                System.out.println(i + " is both a triangle and a square");
            }
            square = false;
            triangle = false;
            test = 0;
		}
    }
}