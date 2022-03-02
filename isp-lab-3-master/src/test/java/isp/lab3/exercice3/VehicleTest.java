package isp.lab3.exercise3;

import isp.lab3.exercise3.Vehicles;
import org.junit.Assert;
import org.junit.Test;


public class VehicleTest {


    @Test
    public void testToString(){
        Vehicles car1= new Vehicles("Mercedes", "Benz", 200, 'D');
        Assert.assertEquals("Value should be model=Mercedes, type=Benz, speed=200, fuelType=D' ", "Vehicles{model='Mercedes', type='Benz', speed=200, fuelType=D}", car1.toString());
    }
}