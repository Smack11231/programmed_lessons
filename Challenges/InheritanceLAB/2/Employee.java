public class Employee extends Person {
    private double payRate;    
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

    public Employee() {
        super();
        payRate = 0;
        hoursWorked = 0;
        department = "null";
    }
    public Employee(String firstName, String lastName, double rate, double worked, String depart) {
        super(firstName,lastName);
        payRate = rate;
        hoursWorked = worked;
        department = depart;
    }

     public String toString() {
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculatePay();
     }

     public void print() {
        System.out.println("The employee " + super.toString() + " from the " + department + " department worked " + hoursWorked + " hours with a pay rate of $" + payRate + ".  The wages for this employee are $" + calculatePay());
     }

     public double calculatePay() {
        if (hoursWorked < HOURS) {
            return (double) payRate * hoursWorked;
        } else {
            return 40.0 * payRate + ((double) (hoursWorked - HOURS) * OVERTIME);
        }
    }

    public void setAll(String first, String last, double rate, double hours, String dep){
        super.setName(first,last);
        payRate = rate;
        hoursWorked = hours;
        department = dep;
    }
    
    public double getPayRate() {
        return payRate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    public String getDepartment() {
        return department;
    }
    
    public boolean equals(Object o) {
        if(o instanceof Employee) {
            Employee emp = (Employee) o;
            return (emp.getPayRate() == this.getPayRate() ) && ( emp.getHoursWorked() == this.getHoursWorked() ) && this.getDepartment().equals( emp.getDepartment()) && super.equals(o);
        } 
        return false;
    }

    public Employee getCopy() {
        return new Employee(super.getFirstName(),super.getLastName(),payRate,hoursWorked,department);
    }

    public void copy(Employee e) {
        super.copy( e );
        department = e.getDepartment();
        hoursWorked = e.getHoursWorked();
        payRate = e.getPayRate();
    }
}
