import java.util.Scanner;
import java.io.*;
 
public class MedievalTester {
    public static void main(String[] args) throws IOException {
        File file;
        Scanner scan;
        Scanner scan2 = new Scanner(System.in);
        PrintWriter output;
        String gameName;
        String menu = "Menu:\n1: Create a new game\n2: Validate a save file\n3: Randomize existing character\n4: Quit";
        
        System.out.println(menu);
        int selection = scan2.nextInt();

        while (selection != 4) {

            if (selection == 1) {
                System.out.println("Enter file name");
                String fileName = scan2.nextLine();
                fileName = scan2.nextLine();
                file = new File(fileName);
                output = new PrintWriter(new FileWriter(file, true));
                
                System.out.println("Enter game name: ");
                gameName = scan2.nextLine();
                output.println(gameName);

                System.out.println("Enter character 1 type:");
                Character char1 = new Character(scan2.nextLine());
                System.out.println(char1);
                System.out.println("Are these stats okay? (y/n)");
                while (scan2.nextLine().equals("n")) {
                    char1.reroll();
                    System.out.println(char1);
                    System.out.println("Are these stats okay? (y/n)");
                }
                System.out.println("Enter the name for this character.");
                char1.setName(scan2.nextLine());
                output.println(char1);

                System.out.println("Enter character 2 type: ");
                Character char2 = new Character(scan2.nextLine());
                System.out.println(char2);
                System.out.println("Are these stats okay? (y/n)");
                while(scan2.nextLine().equals("n")) {
                    char2.reroll();
                    System.out.println(char2);
                    System.out.println("Are these stats okay? (y/n)");
                }
                System.out.println("Enter the name for this character.");
                char2.setName(scan2.nextLine());
                output.println(char2);

                System.out.println("Enter character 3 type: ");
                Character char3 = new Character(scan2.nextLine());
                while (char3.isTooMuch()) {
                    System.out.println("You can't have more than two of a type in your party. Please enter a different type.");
                    char3.setType(scan2.nextLine());
                }
                System.out.println(char3);
                System.out.println("Are these stats okay? (y/n)");
                while(scan2.nextLine().equals("n")) {
                    char3.reroll();
                    System.out.println(char3);
                    System.out.println("Are these stats okay? (y/n)");
                }
                System.out.println("Enter the name for this character.");
                char3.setName(scan2.nextLine());
                output.println(char3);

                System.out.println("Enter character 4 type: ");
                Character char4 = new Character(scan2.nextLine());
                while (char4.isTooMuch()) {
                    System.out.println("You can't have more than two of a type in your party. Please enter a different type.");
                    char4.setType(scan2.nextLine());
                }
                System.out.println(char4);
                System.out.println("Are these stats okay? (y/n)");
                while(scan2.nextLine().equals("n")) {
                    char4.reroll();
                    System.out.println(char4);
                    System.out.println("Are these stats okay? (y/n)");
                }
                System.out.println("Enter the name for this character.");
                char4.setName(scan2.nextLine());
                output.println(char4);

                output.close();
            }

            if (selection == 2){
                System.out.println("Enter name of file you'd like to check");
                String fileName = scan2.nextLine();
                fileName = scan2.nextLine();
                file = new File(fileName);
                scan = new Scanner(file);
            }

            if (selection == 3){
                        
            }

            if (selection == 4){
                System.exit(0); 
            }

            System.out.println(menu);
            selection = scan2.nextInt();
        }
    }
}