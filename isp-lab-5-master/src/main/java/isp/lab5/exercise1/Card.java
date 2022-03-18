package isp.lab5.exercise1;

public class Card {
    private String cardId;
    private String pin;

    public Card(String cardId, String pin) {
        this.cardId = cardId;
        this.pin = pin;
    }

    public String getCardId() {
        return cardId;
    }

    public String displayCard(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" --> The cardID is: ").append(this.cardId).append(" The pin is: ").append(this.pin);
        return stringBuilder.toString();
    }
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
