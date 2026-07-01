/**
 * Third-party Stripe payment gateway.
 */
public class StripeGateway {

    public void pay(double amount) {
        System.out.println("Processing payment of ₹" + amount + " using Stripe.");
    }

}