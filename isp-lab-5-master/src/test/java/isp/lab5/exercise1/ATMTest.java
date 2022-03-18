package isp.lab5.exercise1;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ATMTest {
    Card c1 = new Card("A1", "1234");
    Account a1= new Account("Muresan David", 2501.02, c1);
    Bank b1 = new Bank();
    ATM atm = new ATM(b1);

    @Test
    public void getAccountByCardIdTest() {
        b1.addAccount(a1);
        b1.addCard(c1);
        System.out.println("The method should display the account details:The account with the id: A1 is:  --> The account owner is: Muresan David The balance is: 2501.02 --> The cardID is: A1 The pin is: 1234");
    }

    @Test

    public void changePinTest(){
        b1.addAccount(a1);
        b1.addCard(c1);
        atm.insertCard(c1,"1234");
        atm.change("1234","2345");
        Assert.assertEquals("The method should display the new pin", "2345", c1.getPin());
    }

    @Test

    public void widrowMoneyTest(){
        b1.addAccount(a1);
        b1.addCard(c1);
        atm.insertCard(c1,"1234");
        atm.change("1234","2345");
        atm.withdraw(500);
        Assert.assertEquals("The method should display the new pin", 2001.02, a1.getBalance(), 0.0);
    }

    @Test

    public void checkMoneyTest(){
        b1.addAccount(a1);
        b1.addCard(c1);
        Assert.assertEquals("The method should display the balance of the account", 2501.02, a1.getBalance(), 0.0);
    }

}
