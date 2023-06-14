package org.example.ChainOfResponsibility;

public class SMSNotifer extends Notifer{
    public SMSNotifer(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending sms: ASAP! capacity is less then 5%. " + message);
    }
}
