package isp.lab4.exercise1;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class TemperatureSensorTest {
    TemperatureSensor t1 = new TemperatureSensor(150, "engine");
    @Test

    public void toStringTest(){
        Assert.assertEquals("Expected in test:TemperatureSensor{value=150, location='engine'}", "TemperatureSensor{value=150, location='engine'}", t1.toString() );
    }

    @Test
    public void getValueTest(){
        assertEquals("The value of temperature should be 150 ", 150,t1.getValue() ,(0.0));
    }

    @Test
    public void getTemperatureTest(){
        assertEquals("The location of temperature should be engine", "engine", t1.getLocation());
    }

    //implement minimal tests
}


