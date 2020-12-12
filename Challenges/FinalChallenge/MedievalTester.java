import java.util.Scanner;
import java.io.*;
 
public class MedievalTester {
    public static void main(String[] args) throws IOException {
        File file;
        Scanner scan;
        Scanner scan2;
        PrintWriter output;

        output = new PrintWriter("games.md");
        file = new File("games.md");
        scan = new Scanner(file);
        scan2 = new Scanner(System.in);
        String menu = "Menu:\n1: Create a new game\n2: Validate a save file\n3: Randomize existing character\n4: Quit";
        
        System.out.println(menu);
        int selection = scan2.nextInt();

        while (selection != 4) {

            if (selection == 1) {            
                String gameName;
                System.out.println("Enter game name: ");
                gameName = scan2.nextLine();

                System.out.println("Enter character 1 type:");
                Character char1 = new Character(scan2.nextLine());
                System.out.println(char1);
                System.out.println("Are these stats okay? (y/n)");
                while(!(scan2.nextLine() == "y")) {
                    char1.reroll();
                    System.out.println(char1);
                    System.out.println("Are these stats okay? (y/n)");
                }
                System.out.println("Enter the name for this character.");
                char1.setName(scan2.nextLine());

                System.out.println("Enter character 2 type: ");
                Character char2 = new Character(scan2.nextLine());
                System.out.println(char2);
                System.out.println("Are these stats okay? (y/n)");
                while(!(scan2.nextLine() == "y")) {
                    char2.reroll();
                    System.out.println(char2);
                    System.out.println("Are these stats okay? (y/n)");
                }
                System.out.println("Enter the name for this character.");
                char2.setName(scan2.nextLine());

                System.out.println("Enter character 3 type: ");
                Character char3 = new Character(scan2.nextLine());
                System.out.println(char3);
                System.out.println("Are these stats okay? (y/n)");
                while(!(scan2.nextLine() == "y")) {
                    char3.reroll();
                    System.out.println(char3);
                    System.out.println("Are these stats okay? (y/n)");
                }
                System.out.println("Enter the name for this character.");
                char3.setName(scan2.nextLine());

                System.out.println("Enter character 4 type: ");
                Character char4 = new Character(scan2.nextLine());
                System.out.println(char4);
                System.out.println("Are these stats okay? (y/n)");
                while(!(scan2.nextLine() == "y")) {
                    char4.reroll();
                    System.out.println(char4);
                    System.out.println("Are these stats okay? (y/n)");
                }
                System.out.println("Enter the name for this character.");
                char4.setName(scan2.nextLine());

                Game game = new Game(gameName, char1, char2, char3, char4);
            }

            if (selection == 2){
                        
            }

            if (selection == 3){
                        
            }

            if (selection == 4){
                scan.close();
                scan2.close();
                output.close();
                System.exit(0); 
            }

            System.out.println(menu);
            selection = scan2.nextInt();
        }
    }
}