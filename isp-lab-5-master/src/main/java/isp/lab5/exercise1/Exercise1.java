package isp.lab5.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
         Card c1 = new Card("A1", "1234");
         Account a1= new Account("Muresan David", 2501.02, c1);
         Bank b1 = new Bank();
         b1.addAccount(a1);
         b1.addCard(c1);
         b1.getAccountByCardId("A1");
         ATM atm = new ATM(b1);
         atm.insertCard(c1,"1234");
         atm.change("1234", "2345");
         System.out.println(c1.getPin());
         atm.withdraw(500);
         System.out.println(a1.getBalance());
         atm.check(a1);

    }
}