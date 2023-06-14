package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Saller implements Observed {
    int saledTicketsCount = 0;

    List<SalesObserver> subscribers = new ArrayList<>();

    public void changeCount(int tempCount) {
        saledTicketsCount = saledTicketsCount + tempCount;
        notifyObservers();
    }


    @Override
    public void addObserver(SalesObserver observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(SalesObserver observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(SalesObserver salesObserver : subscribers){
            salesObserver.handleEvent(saledTicketsCount);
        }

    }
}
