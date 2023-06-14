package org.example.ChainOfResponsibility;

public class EmailNotifer extends Notifer{
    public EmailNotifer(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: capacity is less then 20%, number of tickets sold: " + message);
    }
}
