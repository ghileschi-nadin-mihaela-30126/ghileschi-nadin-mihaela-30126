package isp.lab6.exercise4;

abstract public class Transaction {
    protected Account account;

    public Transaction(Account account) {
        this.account = account;
    }

    abstract String execute();
}
