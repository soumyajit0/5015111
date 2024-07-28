package dependencies;

public class StripeGateway {
    public void charge(double amount) {
        System.out.println("Charging Rs " + amount + " made through Stripe.");
    }
}