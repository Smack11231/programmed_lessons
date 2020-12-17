public class UnluckyEvil {
    public static void main(String [] args){
        for(int i = 0; i < 10000; i++){
            if(isUnlucky(i) && isOdious(i)){
                System.out.println("Evil and Unlucky number!: " + i);
            }
        }
    }

    public static boolean isUnlucky (long num) {
        String remainder = String.valueOf(num);
        return remainder.contains("13");
    }

    public static boolean isOdious (int n) {
        int binaryCount = 0;
        while (n > 0) {
            if ((n % 2) == 1) {
                binaryCount ++;
            }
            n /= 2;
        }
        if (binaryCount % 2 == 1) {
            return true;
        } else {
            return false;
        }
     }
}