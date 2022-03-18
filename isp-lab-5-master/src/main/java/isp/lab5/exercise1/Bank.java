package isp.lab5.exercise1;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> list = new ArrayList<>();
    Account[] accounts = new Account[10];
    Card[] cards = new Card[10];
    Account acc = new Account();

    public void addAccount(Account a) {
        for (int i = 0; i < 10; i++) {
            list.add(i,a);
        }
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