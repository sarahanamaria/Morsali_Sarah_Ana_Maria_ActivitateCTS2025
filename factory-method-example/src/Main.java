package src;

// Interfata Notification
interface Notification {
    void notifyUser();
}

// Clase concrete
class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Trimitere email...");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Trimitere SMS...");
    }
}

// Clasa abstracta Factory
abstract class NotificationFactory {
    public abstract Notification createNotification();
}

// Clase factory concrete
class EmailNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new SMSNotification();
    }
}

// Clasa Main
public class Main {
    public static void main(String[] args) {
        NotificationFactory factory;

        String type = "SMS"; // sau "Email"

        if (type.equals("Email")) {
            factory = new EmailNotificationFactory();
        } else if (type.equals("SMS")) {
            factory = new SMSNotificationFactory();
        } else {
            throw new IllegalArgumentException("Tip necunoscut");
        }

        Notification notification = factory.createNotification();
        notification.notifyUser();
    }
}
