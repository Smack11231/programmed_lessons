public class PaycheckTester {
    public static void main(String[] args){

        Employee john = new Employee("John", "manager", 5);
        System.out.println(john.toString());

        Employee jellie = new Employee("Jellie", "subordinate" , 4);
        System.out.println(jellie.toString());

        john.work(4);
        System.out.println(john.toString());
        
        Paycheck johncheck = john.request();
        System.out.println(john.toString());
        System.out.println(johncheck.toString());
    }
}
