package isp.lab3.exercise5;
import isp.lab3.exercise5.VendingMachine;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VendingMachineTest {
    VendingMachine v1 = new VendingMachine(new String[]{"Snickers","Water"}, new double[]{5,5});
    @Test

    public void displayProductsTest(){
       assertEquals("The answer should be: 0 --> The product is: Snickers The price is: 5.0 lei \n1 --> The product is: Water The price is: 5.0 lei ", "0 --> The product is: Snickers The price is: 5.0 lei \n1 --> The product is: Water The price is: 5.0 lei \n", v1.displayProducts() );
    }

    @Test

    public void insertCoinTest(){
        assertEquals("The answer should be 8.0", 8.0 , v1.insertCoins(8.0), 0.0 );
    }

    @Test

    public void selectProductTest(){
        assertEquals("The answer should be: ", "The product with id: 0 is: Snickers", v1.selectProduct(0));
    }


}
