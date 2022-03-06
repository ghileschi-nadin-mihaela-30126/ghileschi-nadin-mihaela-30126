package isp.lab3.exercise4;

import isp.lab3.exercise4.MyPoint;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class MyPointTest {
    MyPoint p1= new MyPoint(1, 1, 2);
    @Test

    public void testDistance(){

       assertEquals("The distane should be 3", 3.0, p1.distance(2,3,4), 0.0);

    }

    @Test

    public void testDistance2(){
        MyPoint p2= new MyPoint(2, 3, 4);

        assertEquals("The distane should be 3", 3.0, p1.distance(p2), 0.0);

    }
}
