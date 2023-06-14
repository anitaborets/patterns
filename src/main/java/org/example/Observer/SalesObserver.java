package org.example.Observer;

//problem: mame kapacitu ZOO a predavame listky online a cez kassu - potrebujeme vediet kolko listkov este mozeme predat
//Observer predava informaciu o pocte predanych listkov z web a offline pokladni, pripadne inych servsov predaja
public interface SalesObserver {
    public void handleEvent(int ticketsCount);
}
