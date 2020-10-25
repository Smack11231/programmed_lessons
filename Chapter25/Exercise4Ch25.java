public class Exercise4Ch25 {
    public static void main( String[] args ) {
        String number = "";
        for(int i = 0; i <= 4; i++) {
            if (i == 0){
                number = "Five";
            } else if (i == 1){
                number = "Four";
            } else if (i == 2){
                number = "Three";
            } else if (i == 3){
                number = "Two";
            } else if (i == 4){
                number = "One";
            }
            System.out.println(number + " little monkeys swinging in a tree \nTeasing Mr Crocodile 'you can't catch me' \nAlong came the crocodile as quiet as can be \nand SNAP!\n");
        }
        System.out.println("No little monkeys swinging in a tree \nNo little monkeys swinging in a tree");
    }
}