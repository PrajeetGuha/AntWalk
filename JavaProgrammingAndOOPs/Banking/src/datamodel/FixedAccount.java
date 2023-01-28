package datamodel;

import java.time.LocalDate;
import java.time.Period;

public class FixedAccount extends Account {

    private int withdrawDuration = 5;

    public FixedAccount(float amount) {
        super(amount);
        this.minimumBalance = 1000;
    }

    @Override
    public boolean withdraw(float amount) {
        LocalDate today = LocalDate.now();
        Period val = accountCreated.until(today);
        if (val.getYears() > withdrawDuration && amount <= (this.balance - this.minimumBalance)) {
            this.balance -= amount;
            return true;
        } else{
            System.out.println("\nInsufficient balance.\n");
            return false;
        }
    }
}