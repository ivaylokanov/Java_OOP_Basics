package pr03_mankind;

import java.text.DecimalFormat;

public class Worker extends Human{
    public static final int weekWorkingDays = 7;
    private double weekSalary;
    private double workHoursPerDay;
    public Worker(String firstName, String lastName, double weekSalary,double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary<10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay<1 || workHoursPerDay>12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public void setLastName(String lastName) {
        if (lastName.length()<3){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Week Salary: ").append(df.format(this.weekSalary)).append("\r\n");
        sb.append("Hours per day: ").append(df.format(this.workHoursPerDay)).append("\r\n");
        sb.append("Salary per hour: ").append(String.format("%.2f",this.weekSalary/(this.workHoursPerDay*weekWorkingDays))).append("\r\n");
        return sb.toString();
    }
}
