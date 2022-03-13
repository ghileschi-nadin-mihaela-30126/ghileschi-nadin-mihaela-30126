package isp.lab4.exercise1;

import isp.lab4.exercise4.TemperatureSensor;
import isp.lab4.exercise4.FireAlarm;
import isp.lab4.exercise4.Controler;

import org.junit.Assert;
import org.junit.Test;

public class ControlerTest2 {
    FireAlarm f1 = new FireAlarm(false);
    TemperatureSensor[] temp = new TemperatureSensor[3];
    TemperatureSensor t1 = new TemperatureSensor(120, "engine");
    TemperatureSensor t2 = new TemperatureSensor( 55,"kitchen");
    TemperatureSensor t3 = new TemperatureSensor(45, "engine");
    Controler c1 = new Controler(f1, temp);

    @Test
    public void isActiveTest(){
        Assert.assertEquals("Expected in test is: false", false, f1.isActive());
    }

    @Test
    public void controlStepTest(){
        temp[0]= t1;
        temp[1]= t2;
        temp[2]= t3;
        c1.controlStep();
        System.out.println("The fire alarm should: start first time \n start second time \n not start 3th time.");
            Assert.assertEquals("Expected in test is: true", true, f1.isActive());

    }

}
