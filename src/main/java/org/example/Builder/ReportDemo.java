package org.example.Builder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class ReportDemo {
    public static void main(String[] args) {
        Report report = new ReportBuilder(LocalDate.now(), 1)
                .setNameReport("Important report")
                .setNextImportantValue(25)
                .setTreasurer("Peter Novak")
                .setSumOfOrders(2500)
                .build();
        System.out.println(report);
    }
}
