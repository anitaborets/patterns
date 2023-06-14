package org.example.ChainOfResponsibility;

//posielame reporty, kolik listkov je predano, len manager je opravneny uzatvorit predaje
public class DemoChain {
    public static void main(String[] args) {
        Notifer report = new SimpleReportNotifer(Priority.ROUTINE);
        Notifer email = new EmailNotifer(Priority.IMPORTANT);
        Notifer sms = new SMSNotifer(Priority.ASAP);

        report.setNextNotifer(email);
        email.setNextNotifer(sms);

        int countOfSoldTicketsRoutine = 1200;
        int countOfSoldTicketsAlarm = 1800;


        report.notifyManager(String.valueOf(countOfSoldTicketsRoutine), Priority.ROUTINE);
        report.notifyManager(String.valueOf(countOfSoldTicketsAlarm), Priority.IMPORTANT);
        report.notifyManager("Please close sales for today!", Priority.ASAP);
    }
}
