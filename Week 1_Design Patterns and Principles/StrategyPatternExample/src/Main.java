import dependencies.CreditCardPayment;
import dependencies.PayPalPayment;
import dependencies.PaymentContext;
import dependencies.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("0123-4567-8901-2345", "Soumyajit Dey Sarkar");
        PaymentStrategy payPalPayment = new PayPalPayment("soumyajitdeysarkar@gmail.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(500);

        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(1000);
    }
}
