package isp.lab4.exercise1;

import isp.lab4.exercise5.TemperatureSensor;
import isp.lab4.exercise5.FireAlarm;
import isp.lab4.exercise5.ControlerH;
import isp.lab4.exercise5.House;
import org.junit.Test;
import org.junit.Assert;

public class HouseTest {
    FireAlarm f1 = new FireAlarm(false);
    TemperatureSensor t1 = new TemperatureSensor(51, "engine");
    TemperatureSensor t2 = new TemperatureSensor(75, "engine");
    TemperatureSensor t3 = new TemperatureSensor(45, "engine");
    TemperatureSensor[] temp = new TemperatureSensor[3];
        ControlerH c1 = new ControlerH();

    @Test
    public void isActiveTest(){
        Assert.assertEquals("Expected in test is: false", false, f1.isActive());
    }

        @Test
        public void controlStepTest() {
            temp[0] = t1;
            temp[1] = t2;
            temp[2] = t3;
            c1.setFireAlarm(f1);
            c1.setTempSensors(temp);
            House h = new House(c1);
            h.getControler().controlStep();
            System.out.println("The fire alarm should start twice. The 3th is below 50.");
                Assert.assertEquals("Expected in test is: true", true, f1.isActive());


        }


}
