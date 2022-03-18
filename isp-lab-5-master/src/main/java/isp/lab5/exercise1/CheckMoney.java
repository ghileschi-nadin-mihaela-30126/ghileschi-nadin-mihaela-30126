package isp.lab5.exercise1;

public class CheckMoney extends Transaction{

    public CheckMoney(Account account) {
        super(account);
    }

    public double check(Account acc){
        double amount;
        amount=acc.getBalance();
        return amount;
    }

    @Override
    String execute() {
        return null;
    }
}
