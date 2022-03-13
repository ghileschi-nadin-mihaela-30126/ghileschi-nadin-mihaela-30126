package isp.lab4.exercise2;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class FireAlarmTest {
    FireAlarm f1 = new FireAlarm(true);

    @Test

    public void toStringTest(){
        Assert.assertEquals("Expected in test: FireAlarm{active=true}", "FireAlarm{active=true}", f1.toString() );

    }
    @Test
    public void isActiveTest(){
        Assert.assertEquals("Expected in test is: true", true, f1.isActive());
    }

}
