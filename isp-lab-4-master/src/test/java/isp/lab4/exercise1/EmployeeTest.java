package isp.lab4.exercise1;

import isp.lab4.exercise6.ComissionEmployee;
import isp.lab4.exercise6.Employee;
import isp.lab4.exercise6.HourlyEmployee;
import isp.lab4.exercise6.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    Employee e1 = new Employee("Daniel", "Vuia");
    ComissionEmployee c1 = new ComissionEmployee("Andreea", "Popa", 3500, 10);
    SalariedEmployee s1 = new SalariedEmployee("Maria", "Norman", 900);
    HourlyEmployee h1 = new HourlyEmployee("Razvan", "Petre", 30, 8);

    @Test

    public void getPaymentAmountTestE() {
        Assert.assertEquals("The method should display 0.0", 0.0, e1.getPaymentAmount(), 0.0);
    }

    @Test

    public void getPaymentAmountC() {
        Assert.assertEquals("The method should display 350", 350, c1.getPaymentAmount(), 0.0);
    }

    @Test
    public void getPaymentAmountS() {
        Assert.assertEquals("The method should display 900", 900, s1.getPaymentAmount(), 0.0);
    }

    @Test

    public void getPaymentAmountH() {
        Assert.assertEquals("The method should display 240", 240, h1.getPaymentAmount(), 0.0);
    }
}

