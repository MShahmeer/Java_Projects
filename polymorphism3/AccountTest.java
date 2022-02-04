package com.bitspedia.polymorphism3;

import com.bitspedia.inheritance3.CommissionedEmployee;
import com.bitspedia.inheritance3.HourlyEmployee;

public class AccountTest {

    public static void main(String[] args) {
        Accounts accounts = new Accounts();

        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Ali", 1000, 10000, 0.03f, 12);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Ali", 1000, 500, 40, 23);

        accounts.depositEarningsIntoBank(commissionedEmployee);
        accounts.depositEarningsIntoBank(hourlyEmployee);

    }
}
