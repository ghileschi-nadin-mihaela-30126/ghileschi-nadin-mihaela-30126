package isp.lab5.exercise1;

public class ChangePin extends Transaction{
    private String oldPin;
    private String newPin;

    public ChangePin(Account account, String oldPin, String newPin) {
        super(account);
        this.oldPin = oldPin;
        this.newPin = newPin;
    }

    public String change(String oldPin, String newPin){
        Card c1 = account.getCard();
        if(c1.getPin()== oldPin){
            c1.setPin(newPin);
            System.out.println("The pin was changed succesfully!");
        } else {
            System.out.println("Incorect old pin.");
        }
        return newPin;
    }

    @Override
    String execute() {
        return null;
    }
}
