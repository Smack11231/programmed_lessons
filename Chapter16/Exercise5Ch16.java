import java.util.Scanner;

public class Exercise5Ch16 {
    public static void main( String[] args) {
        Scanner scan = new Scanner(System.in);
        int cur, birth, test, age = 0;
        System.out.println("Enter birth year:");
        birth = scan.nextInt();
        System.out.println("Enter current year:");
        cur = scan.nextInt();
        if (cur > birth) {
            age = cur - birth;
        } else if (birth > cur){
            age = (100 - birth) + cur;
        } else if (birth == cur) {
            age = 0;
        }
        
        System.out.println("Your age: " + age);
    }
}