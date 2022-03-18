package isp.lab5.exercise1;

public class ATM {
    private Bank bank;
    private Card card;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void insertCard(Card c, String pin) {
        card = c;
        if (card != null) {
            if (c.getPin().equals(pin)) {
                System.out.println("Card accepted.");
                card = c;
            } else {
                System.out.println("Pin is not valid.");
            }
        } else {
            System.out.println("No card was found.");
        }
    }

    public void removeCard(){
        System.out.println("Card was removed.");
        card = null;
    }

    public void withdraw(int amount){
        if(card!=null){
            Account acc = bank.getAccountByCardId(card.getCardId());
            WithdrawMoney tw = new WithdrawMoney(acc, amount);
            bank.executeTransaction(tw);

        }else{
            System.out.println("No card present.");
        }
    }

    public void change(String oldPin, String newPin){
        Account acc = bank.getAccountByCardId(card.getCardId());
        ChangePin cp = new ChangePin(acc, oldPin, newPin);
        cp.change(oldPin, newPin);
        bank.executeTransaction(cp);
    }

    public void check(Account acc){
        acc = bank.getAccountByCardId(card.getCardId());
        CheckMoney c1 = new CheckMoney(acc);
        System.out.println("The amount of money you have in your bank account is: " + c1.check(acc));
        bank.executeTransaction(c1);

    }
}
