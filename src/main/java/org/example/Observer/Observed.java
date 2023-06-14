package org.example.Observer;

public interface Observed {

    public void addObserver (SalesObserver observer);
    public void removeObserver (SalesObserver observer);
    public void notifyObservers();
}
