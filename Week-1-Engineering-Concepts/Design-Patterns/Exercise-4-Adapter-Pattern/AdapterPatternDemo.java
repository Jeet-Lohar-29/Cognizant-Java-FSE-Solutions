/**
 * Demonstrates the Adapter Pattern.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        PaymentProcessor paypal =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripe =
                new StripeAdapter(new StripeGateway());

        paypal.processPayment(1500);

        stripe.processPayment(2500);

    }

}