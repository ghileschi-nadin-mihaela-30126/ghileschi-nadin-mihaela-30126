package isp.lab4.exercise6;

public class ComissionEmployee extends Employee{
    private double grossSales;
    private double comissionSales;

    public ComissionEmployee(String firstName, String secondName, double grossSales, double comissionSales) {
        super(firstName, secondName);
        this.grossSales = grossSales;
        this.comissionSales = comissionSales;
    }

    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        double result;
        result=(grossSales*comissionSales)/100;
        return result;
    }
}
