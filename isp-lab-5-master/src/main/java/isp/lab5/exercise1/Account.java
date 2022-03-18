package isp.lab5.exercise1;

public class Account {
    private String owner;
    private double balance;
    private Card card;

    public Account(String owner, double balance, Card card) {
        this.owner = owner;
        this.balance = balance;
        this.card = card;
    }

    public Account(){
        //
    }

    public String displayAccount(){
        StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" --> The account owner is: ").append(this.owner).append(" The balance is: ").append(this.balance).append(card.displayCard());
            return stringBuilder.toString();
        }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }


}
