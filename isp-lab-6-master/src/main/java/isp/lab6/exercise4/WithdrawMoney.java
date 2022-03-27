package isp.lab6.exercise4;

public class WithdrawMoney extends Transaction {
    private int amount;

    public WithdrawMoney(Account account, int amount) {
        super(account);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String execute() {
        if (account.getBalance() > amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Transaction executed");
        }
        return "EXECUTED!";
    }
}