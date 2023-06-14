package org.example.Strategy;

public class PayByWebMoney implements StrategyInterface{
    boolean isAuthorized;
    @Override
    public boolean pay(int paymentAmount) {
        try {
            System.out.println("Paying " + paymentAmount + " using WebMoney.");
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!isAuthorized) {
              //some authorization method
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

