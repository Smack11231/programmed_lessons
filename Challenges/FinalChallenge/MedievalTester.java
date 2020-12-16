import java.util.Scanner;
import java.io.*;
 
public class MedievalTester {
    public static void main(String[] args) throws IOException {
        File file;
        Scanner scan;
        Scanner scan2 = new Scanner(System.in);
        PrintWriter output;
        String gameName;
        String menu = "Menu:\n1: Create a new game\n2: Validate a save file (you won't see anything unless there are errors)\n3: Randomize existing character\n4: Quit";
        
        System.out.println(menu);
        int selection = scan2.nextInt();

        while (selection != 4) {

            if (selection == 1) {
                Character characterset = new Character("null");
                characterset.setCount();
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

                Character char1, char2, char3, char4;
                Character starter = new Character("null");

                scan.nextLine();
                if (scan.hasNextLine()){
                    starter.setCount();
                    String[] parameters = scan.nextLine().split(",");
                    char1 = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    if (char1.isTooMuch()) {
                        System.out.println("This file has more than two instances of a character type.");
                    }
                    if (char1.tooManyPoints()) {
                        System.out.println("Character 1 has too many or too little status points.");
                    }
                }
                if (scan.hasNextLine()){
                    String[] parameters = scan.nextLine().split(",");
                    char2 = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    if (char2.isTooMuch()) {
                        System.out.println("This file has more than two instances of a character type.");
                    }
                    if (char2.tooManyPoints()) {
                        System.out.println("Character 2 has too many or too little status points.");
                    }
                }
                if (scan.hasNextLine()){
                    String[] parameters = scan.nextLine().split(",");
                    char3 = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    if (char3.isTooMuch()) {
                        System.out.println("This file has more than two instances of a character type.");
                    }
                    if (char3.tooManyPoints()) {
                        System.out.println("Character 3 has too many or too little status points.");
                    }
                }
                if (scan.hasNextLine()){
                    String[] parameters = scan.nextLine().split(",");
                    char4 = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                    if (char4.isTooMuch()) {
                        System.out.println("This file has more than two instances of a character type.");
                    }
                    if (char4.tooManyPoints()) {
                        System.out.println("Character 4 has too many or too little status points.");
                    }
                } else {
                    System.out.println("There are not enough characters in the file.");
                }

            }

            if (selection == 3){
                System.out.println("Enter file name:");
                String fileName = scan2.nextLine();
                fileName = scan2.nextLine();
                file = new File(fileName);
                scan = new Scanner(file);

                gameName = scan.nextLine();
                String[] parameters = scan.nextLine().split(",");
                Character char1 = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                System.out.println(char1);
                
                parameters = scan.nextLine().split(",");
                Character char2 = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                System.out.println(char2);
                
                parameters = scan.nextLine().split(",");
                Character char3 = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                System.out.println(char3);
                
                parameters = scan.nextLine().split(",");
                Character char4 = new Character(parameters[0], parameters[1], Integer.parseInt(parameters[2]), Integer.parseInt(parameters[3]), Integer.parseInt(parameters[4]), Integer.parseInt(parameters[5]), Integer.parseInt(parameters[6]));
                System.out.println(char4);
                
                System.out.println("Which character would you like to reroll?");
                String changeChar = scan2.nextLine();
                if (changeChar.equals(char1.getName())) {
                    char1.rerollAgain(char1);
                    System.out.println("Character randomized successfully: ");
                    System.out.println(char1);
                } else if (changeChar.equals(char2.getName())) {
                    char2.rerollAgain(char2);
                    System.out.println("Character randomized successfully: ");
                    System.out.println(char2);
                } else if (changeChar.equals(char3.getName())) {
                    char3.rerollAgain(char3);
                    System.out.println("Character randomized successfully: ");
                    System.out.println(char3);
                } else if (changeChar.equals(char4.getName())) {
                    char4.rerollAgain(char4);
                    System.out.println("Character randomized successfully: ");
                    System.out.println(char4);
                } else {
                    System.out.println("No characters matched that name.");
                }

                FileWriter writer = new FileWriter(file);
                writer.write(gameName + "\n" + char1 + "\n" + char2 + "\n" + char3 + "\n" + char4);
                writer.close();
            }

            if (selection == 4){
                System.exit(0); 
            }

            System.out.println(menu);
            selection = scan2.nextInt();
        }
        scan2.close();
    }
}