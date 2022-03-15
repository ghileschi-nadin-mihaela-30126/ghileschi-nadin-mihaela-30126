package isp.lab5.exercise1;

import java.util.ArrayList;

public class Bank {

    Account[] accounts= new Account[10];
    Card[] cards = new Card[10];

    public void addAccount(Account a) {
        for(int i=0; i<10; i++){
            accounts[i]=a;
        }
    }

    public void addCard(Card c){
        for(int i=0; i<10; i++){
            cards[i]=c;
        }
    }

    public void executeTransaction(Transaction t) {
        t.execute();
    }

    public Account getAccountByCardId(String id) {
         for(int i=0; i<10; i++){
             cards[i].getCardId();
         }
    }
}