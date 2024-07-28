import dependencies.PayPalAdapter;
import dependencies.PayPalGateway;
import dependencies.PaymentProcessor;
import dependencies.StripeAdapter;
import dependencies.StripeGateway;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        PaymentProcessor payPalProcessor = new PayPalAdapter(new PayPalGateway());
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());

        payPalProcessor.processPayment(500.0);
        stripeProcessor.processPayment(600.0);
    }
}
