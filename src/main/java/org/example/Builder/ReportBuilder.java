package org.example.Builder;

import lombok.Data;
import org.example.Strategy.Order;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
public class ReportBuilder {

    // required parameters
    private LocalDate date;
    private int id;

    // optional parameters
    private String nameReport;
    private List<Order> orders;
    private double sumOfOrders;
    private String treasurer;
    private String importantValue;
    private int nextImportantValue;
    private int thirdImportantValue;

    public ReportBuilder(LocalDate date, int id) {
        this.date = date;
        this.id = id;
    }

    public ReportBuilder setNameReport(String nameReport) {
        this.nameReport = nameReport;
        return this;
    }

    public ReportBuilder setOrders(List<Order> orders) {
        this.orders = orders;
        return this;
    }

    public ReportBuilder setSumOfOrders(double sumOfOrders) {
        this.sumOfOrders = sumOfOrders;
        return this;
    }

    public ReportBuilder setTreasurer(String treasurer) {
        this.treasurer = treasurer;
        return this;
    }

    public ReportBuilder setImportantValue(String importantValue) {
        this.importantValue = importantValue;
        return this;
    }

    public ReportBuilder setNextImportantValue(int nextImportantValue) {
        this.nextImportantValue = nextImportantValue;
        return this;
    }

    public ReportBuilder ThirdImportantValue(int thirdImportantValue) {
        this.thirdImportantValue = thirdImportantValue;
        return this;
    }

    public Report build(){
        return new Report(this);
    }
}
