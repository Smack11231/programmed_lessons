public class Paycheck {
    boolean isErroneous = false;
    String employee = "";
    int hours = 0;
    double paycheck = 0;

    public Paycheck(Employee name){
        this.employee = name.getName();
        this.hours = name.getCurrentHours();
        this.paycheck = name.getWage()*name.getCurrentHours();
        if (paycheck >= 1500 || hours >= 100) isErroneous = true;
    }

    public String toString(){
        if (isErroneous){
            return "Erroneous Paycheck";
        }
        return "\nEmployee: " + employee + "\nPaycheck amount: " + paycheck;
    }
}