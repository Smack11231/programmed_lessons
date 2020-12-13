import java.util.Scanner;
import java.io.*;
 
public class TodoTester {
    public static void main(String[] args) throws IOException {
        File file;
        Scanner scan;
        Scanner scan2;
        PrintWriter output;

        output = new PrintWriter("tasks.md");
        file = new File("tasks.md");
        scan = new Scanner(file);
        scan2 = new Scanner(System.in);
        String menu = "Menu\n1: Create a new task\n5: Quit";
            
        Todo task1 = new Todo("bike", "january", 3);

        System.out.println(menu);
        int selection = scan2.nextInt();
        output.println(task1);


        while (selection != 5) {
            if (scan2.hasNextInt()) {
                menu = "Menu:\n1: Create a new task\n2: Update a current task\n3: Remove a current task\n4: Clear all tasks \n5: Quit";
            } else {
                menu = "Menu\n1: Create a new task\n5: Quit";
            }

            if (selection == 1) {
                System.out.println("Enter description: ");
                String desc = scan2.nextLine();
                System.out.println("Enter due date: ");
                String date = scan2.nextLine();
                System.out.println("Enter priority (1-5): ");
                int prio = scan2.nextInt();
                Todo task = new Todo(desc, date, prio);
                output.println(task);
            }

            if (selection == 2){
                        
            }

            if (selection == 3){
                        
            }

            if (selection == 4){
                        
            }

            if (selection == 5){
                scan.close();
                scan2.close();
                output.close();
                System.exit(0);
            }

            System.out.println(menu);
            selection =scan2.nextInt();
        }

    }
}