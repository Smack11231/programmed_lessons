public class Exercise1Ch24 {
    public static void main( String[] args ) {
        double N = 0, t=1;
        for (int i = 0;i<25;i++) {
            N = (1 + (10 * t));
            N = 220 / N;
            System.out.println("There are " + N + " sheep in the herd at " + i + " years.");
            t = t * 0.85;
            if (N > 80) {
                System.out.println(" The herd can maintain itself.");
            }
        }

    }
}