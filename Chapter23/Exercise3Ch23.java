public class Exercise3Ch23 {
    public static void main ( String[] args ) {
        double effect = 100;
        int month = 0;
        while (effect > 50) {
            System.out.println("Month: " + month + "\tEffectiveness: " + effect);
            effect -= (0.04*effect);
            month ++;
        }
        System.out.println("Month: " + month + "\tEffectiveness: " + effect + " DISCARDED");
    }
}