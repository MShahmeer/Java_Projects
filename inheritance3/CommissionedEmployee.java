package com.bitspedia.inheritance3;

public class CommissionedEmployee extends Employee {

    private int totalSales;
    private float commissionRate;

    public CommissionedEmployee(String name,
                                int basicSalary,
                                int totalSales,
                                float commissionRate,
                                int accountNumber) {
        super(name, basicSalary, accountNumber);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public int getEarnings() {
        int totalCommission = (int) (totalSales * (commissionRate / 100));
        return super.getEarnings() + totalCommission;
    }
}



