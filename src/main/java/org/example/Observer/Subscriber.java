package org.example.Observer;

public class Subscriber implements SalesObserver {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(int ticketsCount) {
        System.out.println("Dear " + name + ", Pocet predanych liskov: " + ticketsCount);
    }
}
