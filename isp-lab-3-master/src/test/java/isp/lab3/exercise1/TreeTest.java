package isp.lab3.ex1;

import isp.lab3.exercise1.Tree;
import org.junit.Assert;
import org.junit.Test;


public class TreeTest {
    @Test
    public void testGrow(){
        Tree t1= new Tree();
        t1.grow(2); // > 15+2=17
        Assert.assertEquals("Value should be 17", 17, t1.getHeight());
    }

    @Test
    public void testToString(){
        Tree t1= new Tree();
        t1.grow(1);
        Assert.assertEquals("Value should be '16' ","16", t1.toString());
    }
}
