public class Employee {
    String name = "", position = "";
    double wage = 0, paycheck = 0;
    int id = 0;
    int currentHoursWorked = 0, totalHoursWorked = 0;
    int x = 0;

    public Employee(String name, String position, int wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
    }
    public void work(int hours) {
        this.currentHoursWorked = hours;
        this.totalHoursWorked += hours;
    }
    public int createId() {
        int id = x;
        this.x += 1;
    }

    public double request(){
        this.paycheck = currentHoursWorked*wage - 0.15*currentHoursWorked*wage;
        return paycheck;
    }
    public int getCurrentHours() {
        return currentHoursWorked;
    }
    public double getWage() {
        return wage;
    }
    public double getPaycheck() {
        return paycheck;
    }
    public String getName() {
        return name;
    }
}