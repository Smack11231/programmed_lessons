import java.util.Scanner;
public class Exercise4Ch17 {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character name: ");
        String name = scan.nextLine();
        System.out.println("Enter Strength (1-10): ");
        int strength = scan.nextInt();
        System.out.println("Enter Health (1-10): ");
        int health = scan.nextInt();
        System.out.println("Enter Luck (1-10): ");
        int luck = scan.nextInt();
        int total = luck + health + strength;
        if (total > 15) {
            health = 5;
            strength = 5;
            luck = 5;
            System.out.println("You've entered too many points. Default values of 5 for each have been assigned.");
        } 
        System.out.println(name + ", strength: " + strength + ", health: " + health + ", luck: " + luck );
    }
}