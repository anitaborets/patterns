package org.example.ChainOfResponsibility;

public class SimpleReportNotifer extends Notifer{
    public SimpleReportNotifer(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Routine report, capacity is more then 50%, number of tickets sold: " + message);
    }
}
