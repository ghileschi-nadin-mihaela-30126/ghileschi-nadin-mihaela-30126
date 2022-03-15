package isp.lab5.exercise1;

public class CheckMoney extends Transaction{
    private int money;

    public CheckMoney(Account account, int money) {
        super(account);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}
