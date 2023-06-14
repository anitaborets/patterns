package org.example.Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static StrategyInterface strategy;

    public static void main(String[] args) throws IOException {

        //some method to put tickets in the backet
        int totalSum = 1000;

        if (strategy == null) {
            System.out.println("Please, select a payment method:" + "\n" +
                    "1 - WebMoney" + "\n" +
                    "2 - Credit Card");
            String paymentMethod = reader.readLine();

            if (paymentMethod.equals("1")) {
                strategy = new PayByWebMoney();
            } else {
                strategy = new PayByCard();
            }
        }
        if (strategy.pay(totalSum)) {
            System.out.println("Payment has been successful.");
        } else {
            System.out.println("FAIL! Please, check your data.");
        }
    }
}
