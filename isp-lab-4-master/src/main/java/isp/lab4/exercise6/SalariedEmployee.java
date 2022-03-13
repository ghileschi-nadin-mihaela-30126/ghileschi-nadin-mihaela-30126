package isp.lab4.exercise6;

public class SalariedEmployee extends Employee{
     private double weeklySalary;

    public SalariedEmployee(String firstName, String secondName, double weeklySalary) {
        super(firstName, secondName);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        double result;
        result=weeklySalary;
        return result;
    }
}
