package com.bitspedia.inheritance3;

public class EmployeeTest {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Alice", 50000, 30, 20, 1254);
        System.out.println("Total Earnings of Hourly Employee : " + hourlyEmployee.getEarnings());

        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Bob", 70000, 500000, 3, 12345);
        System.out.println("Total Earnings of Commissioned Employee : " + commissionedEmployee.getEarnings());

    }
}