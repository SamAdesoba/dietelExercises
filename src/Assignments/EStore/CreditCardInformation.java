package Assignments.EStore;

public class CreditCardInformation extends BillingInformation{

    private CardType cardType;
    private String cardNumber;
    private String cardName;
    private String cardYear;
    private String cardMonth;
    private String cardCvv;

    public CreditCardInformation(String cardNumber, String cardName, String cardYear, String cardMonth, String cardCvv) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardYear = cardYear;
        this.cardMonth = cardMonth;
        this.cardCvv = cardCvv;
    }
}
