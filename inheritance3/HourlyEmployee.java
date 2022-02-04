package com.bitspedia.inheritance3;

public class HourlyEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int basicSalary,
                          int hourlyRate, int hoursWorked,
                          int bankAccountNumber) {
        super(name, basicSalary, bankAccountNumber);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public int getEarnings() {
        return super.getEarnings() + (hoursWorked * hourlyRate);
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}