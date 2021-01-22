// import java.util.Scanner;
public class ClientEmployee {
    public static void main(String[] arg) {

        // Scanner input = new Scanner(System.in);
        // String last, first, dept;
        // double pay_rate;
        // int hours;

        Employee prof = new Employee("John", "Doe", 25.50, 50, "COSC"); //subclass alternate constructor invoked
        Employee newEmp = new Employee(); //subclass default constructor invoked

        System.out.println(prof);
        System.out.println(newEmp);

        prof.print();
        newEmp.print();

        newEmp.copy( prof );
        System.out.println( newEmp.equals( prof ) );
    }

}