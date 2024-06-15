package com.solid.srp;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Ehab");
        TimeSheetReport timeSheetReport = new TimeSheetReport();
        timeSheetReport.printTimeSheetReport(employee);
    }
}
