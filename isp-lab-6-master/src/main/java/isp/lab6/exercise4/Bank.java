package isp.lab6.exercise4;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> list = new ArrayList<>();
    Card[] cards = new Card[10];
    Account acc = new Account();

    public void addAccount(Account a) {
            list.add(a);
    }

    public void addCard(Card c) {
        for (int i = 0; i < 10; i++) {
            cards[i] = c;
        }
    }

    public void executeTransaction(Transaction t) {
        t.execute();
    }

    public Account getAccountByCardId(String id) {
        String[] id1 = new String[10];
        for (int i = 0; i < 10; i++) {
            id1[i] = cards[i].getCardId();
            if (id1[i] == id) {
                acc = list.get(i);
                System.out.println("The account with the id: " + id1[i] + " is: " + acc.displayAccount());
                break;
            }
        }
        return acc;
    }
}
