public class Employee {
    private String name = "", position = "";
    private double wage = 0, paycheck = 0;
    private static int id = 0;
    private int currentHoursWorked = 0, totalHoursWorked = 0;

    public Employee(String name, String position, int wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.id = id;
        id++;
    }
    public void work(int hours) {
        this.currentHoursWorked += hours;
        this.totalHoursWorked += hours;
    }


    public double request(){
        double paycheck = new Paycheck(this);
        return paycheck;
        this.currentHoursWorked = 0;
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

    public double getPaycheck() {
        return paycheck;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString(){
      return contents + "   " +  date + "   " +  capacity + " fl. oz."  ;
    }
}