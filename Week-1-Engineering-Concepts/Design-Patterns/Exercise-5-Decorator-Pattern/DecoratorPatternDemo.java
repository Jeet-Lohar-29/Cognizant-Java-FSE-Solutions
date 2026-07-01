/**
 * Demonstrates the Decorator Pattern.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();

        System.out.println("Email Notification");
        notifier.send("Server Backup Completed");

        System.out.println();

        System.out.println("Email + SMS Notification");
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Server Backup Completed");

        System.out.println();

        System.out.println("Email + SMS + Slack Notification");
        Notifier fullNotifier = new SlackNotifierDecorator(
                                    new SMSNotifierDecorator(
                                        new EmailNotifier()));

        fullNotifier.send("Server Backup Completed");
    }
}