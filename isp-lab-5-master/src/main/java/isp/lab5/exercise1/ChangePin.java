package isp.lab5.exercise1;

public class ChangePin extends Transaction{
    private String oldPin;
    private String newPin;

    public ChangePin(Account account, String oldPin, String newPin) {
        super(account);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }
}
