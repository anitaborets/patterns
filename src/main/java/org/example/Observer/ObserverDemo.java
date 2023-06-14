package org.example.Observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Saller webSaller = new Saller();
        Saller boxOffice = new Saller();
        webSaller.changeCount(100);
        boxOffice.changeCount(20);

        SalesObserver web = new Subscriber("Online sales");
        SalesObserver offline = new Subscriber("Offline sales");
        SalesObserver boss = new Subscriber("BOSS");

        webSaller.addObserver(web);
        webSaller.addObserver(offline);
        webSaller.addObserver(boss);

        boxOffice.addObserver(web);
        boxOffice.addObserver(offline);
        boxOffice.addObserver(boss);

        webSaller.changeCount(50);
        System.out.println("*******************");
        webSaller.changeCount(20);
        System.out.println("*******************");
        webSaller.changeCount(32);

    }
}
