package dependencies;

public class CreditCardPayment implements PaymentStrategy {
    @SuppressWarnings("unused")
    private String cardNumber;
    @SuppressWarnings("unused")
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid Rs " + amount + " using Credit Card.");
    }
}
