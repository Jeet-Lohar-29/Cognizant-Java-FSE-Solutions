/**
 * Demonstrates the Strategy Pattern.
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {

        PaymentContext paymentContext =
                new PaymentContext(new CreditCardPayment());

        System.out.println("Payment using Credit Card");
        paymentContext.makePayment(2500);

        System.out.println();

        paymentContext.setPaymentStrategy(new PayPalPayment());

        System.out.println("Payment using PayPal");
        paymentContext.makePayment(4500);

    }

}