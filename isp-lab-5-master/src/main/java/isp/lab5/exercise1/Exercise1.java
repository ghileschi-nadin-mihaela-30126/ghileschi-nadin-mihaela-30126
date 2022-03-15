package isp.lab5.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
         Card c1 = new Card(0, 1234);
         Account a1= new Account("Muresan David", 2501.02, c1);
         Bank b1 = new Bank();
         b1.addAccount(a1);
         b1.getAccountByCardId();

    }
}