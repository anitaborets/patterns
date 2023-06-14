package org.example.Strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCard implements StrategyInterface {
    private CreditCard card;
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }

    public class CreditCard {
        private int amount;
        private String number;
        private String date;
        private String cvv;

        CreditCard(String number, String date, String cvv) {
            this.number = number;
            this.date = date;
            this.cvv = cvv;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }
    }
}
