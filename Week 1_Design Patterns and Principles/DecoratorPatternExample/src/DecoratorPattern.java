import dependencies.EmailNotifier;
import dependencies.Notifier;
import dependencies.SMSNotifierDecorator;
import dependencies.SlackNotifierDecorator;

public class DecoratorPattern {
    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        slackNotifier.send("Hello! this is a test notification!");
    }
}
