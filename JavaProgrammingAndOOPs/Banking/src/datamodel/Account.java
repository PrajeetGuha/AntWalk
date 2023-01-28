package datamodel;

import java.time.LocalDate;

public class Account {

    private int accId;
    protected float balance;
    protected LocalDate accountCreated;
    protected float minimumBalance;

    private static int countAccounts = 0;
    public Account(float amount){
        countAccounts += 1;
        this.accId = countAccounts;
        this.balance = amount;
        this.accountCreated = LocalDate.now();
    }

    public boolean deposit(float amount) {
        balance += amount;
        return true;
    }
    
    public boolean withdraw(float amount){
        if (amount <= (this.balance-this.minimumBalance)){
            this.balance -= amount;
            return true;
        }
        else{
            System.out.println("\nInsufficient balance.\n");
            return false;
        }
    }

    public float checkBalance(){
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account [accId=" + accId + ", balance=" + balance + ", accountCreated=" + accountCreated
                + ", minimumBalance=" + minimumBalance + "]";
    }
    
}