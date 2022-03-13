package isp.lab4.exercise1;
import isp.lab4.exercise3.FireAlarm;
import isp.lab4.exercise3.TemperatureSensor;
import isp.lab4.exercise3.Controler;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class ControlerTest {
    FireAlarm f1 = new FireAlarm(false);
    TemperatureSensor t1 = new TemperatureSensor(51, "engine");
    Controler c1 = new Controler(f1, t1);

    @Test

    public void isActiveTest(){
                Assert.assertEquals("Expected in test is: false", false, f1.isActive());
}

    @Test
    public void toStringTest(){
        Assert.assertEquals("Expected in test:TemperatureSensor{value=51, location='engine'}", "TemperatureSensor{value=51, location='engine'}", t1.toString() );
    }

    @Test

    public void controlStepTest(){
        c1.controlStep();
        System.out.println("The fire alarm should start.");
    }

}
