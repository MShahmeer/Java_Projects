package com.bitspedia.inheritance3;

public class CommissionPlusHourlyEmployee extends CommissionedEmployee {
    private int hourlyRate;
    private int hoursWorked;

    public CommissionPlusHourlyEmployee(String name, int basicSalary,
                                        int hourlyRate, int hoursWorked,
                                        int totalSales, float commissionRate,
                                        int bankAccountNumber) {
        super(name, basicSalary, totalSales, commissionRate, bankAccountNumber);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int getEarnings() {
        return super.getEarnings() + (hoursWorked * hourlyRate);
    }
}