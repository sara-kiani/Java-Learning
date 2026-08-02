package ir.javacup.NotificationSystem;

import java.util.Scanner;

enum MessageType {
    EMAILMESSAGE,
    SMSMESSAGE,
    NOTIFICATION
}

class Notification {
    String name;
    String address;
    String message;

    public Notification(String name, String address, String message) {
        this.name = name;
        this.address = address;
        this.message = message;
    }

    public void send() {
        System.out.println("Sending message to " + name + ": " + message);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Message: " + message;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }
}

class EmailNotification extends Notification {
    public EmailNotification(String name, String address, String message) {
        super(name, address, message);
    }

    @Override
    public void send() {
        System.out.println("Sending EMAIL to " + name + " (" + address + "): " + message);
    }
}

class SMSNotification extends Notification {
    public SMSNotification(String name, String address, String message) {
        super(name, address, message);
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + name + " (" + address + "): " + message);
    }
}

class PushNotification extends Notification {
    public PushNotification(String name, String address, String message) {
        super(name, address, message);
    }

    @Override
    public void send() {
        System.out.println("Sending PUSH Notification to " + name + " (" + address + "): " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter type (EMAILMESSAGE/SMSMESSAGE/NOTIFICATION): ");
        String type = scanner.nextLine().toUpperCase();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your message: ");
        String msg = scanner.nextLine();

        Notification notification;

        if (type.equals("EMAILMESSAGE")) {
            notification = new EmailNotification(name, address, msg);
        } else if (type.equals("SMSMESSAGE")) {
            notification = new SMSNotification(name, address, msg);
        } else if (type.equals("NOTIFICATION")) {
            notification = new PushNotification(name, address, msg);
        } else {
            System.out.println("Invalid type! Please restart the program.");
            scanner.close();
            return;
        }

        notification.send();
        scanner.close();
    }
}