package isp.lab4.exercise6;

public class HourlyEmployee extends Employee{
   private double wage;
   private double hours;

    public HourlyEmployee(String firstName, String secondName, double wage, double hours) {
        super(firstName, secondName);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        double result = wage*hours;
        return result;
    }
}
