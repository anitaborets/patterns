package org.example.Builder;

import lombok.Data;
import org.example.Strategy.Order;

import java.time.LocalDate;
import java.util.List;

@Data
public class Report {
    private LocalDate date;
    private int id;
    private String nameReport;
    private List<Order> orders;
    private double sumOfOrders;
    private String treasurer;
    private String importantValue;
    private int nextImportantValue;
    private int thirdImportantValue;

    public Report(ReportBuilder builder) {
        this.date = builder.getDate();
        this.id = builder.getId();
        this.nameReport = builder.getNameReport();
        this.orders = builder.getOrders();
        this.sumOfOrders = builder.getSumOfOrders();
        this.treasurer = builder.getTreasurer();
        this.importantValue = builder.getImportantValue();
        this.nextImportantValue = builder.getNextImportantValue();
        this.thirdImportantValue = builder.getThirdImportantValue();
    }
}
