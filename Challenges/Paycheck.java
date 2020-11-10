package Challenges;

public class Paycheck {
    boolean isErroneous = false;
    String employee = "";
    int hours = 0;
    double wage = 0, paycheck = 0;

    public Paycheck(Employee name){
        this.employee = name.getName();
        this.hours = name.getCurrentHours();
        this.wage = name.getWage();
        this.paycheck = name.getPaycheck();
        if (paycheck >= 1500 || hours >= 100) isErroneous = true;
    }
}