public class Employee {
    private String name = "", position = "";
    private double wage = 0;
    private static int userId = 1;
    private int id;
    private int currentHoursWorked = 0, totalHoursWorked = 0;

    public Employee(String name, String position, int wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.id = userId;
        this.userId++;
    }

    public void work(int hours) {
        this.currentHoursWorked += hours;
        this.totalHoursWorked += hours;
    }


    public Paycheck request(){
        Paycheck paycheck = new Paycheck(this);
        this.currentHoursWorked = 0;
        return paycheck;
    }

    public int getCurrentHours() {
        return currentHoursWorked;
    }
    public int getTotalHours() {
        return totalHoursWorked;
    }
    public double getWage() {
        return wage;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public String toString(){
      return "Employee: " + name + "\nID: " +  id + "\nWage: " + wage + "\nTotal hours worked: " + totalHoursWorked + "\nCurrent hours worked: " + currentHoursWorked;
    }
}