package datamodel;

import java.util.Date;

public class Account {

    private int accId;
    private float balance;
    protected Date accountCreated;
    protected float minimumBalance;

    private static int countAccounts = 0;
    public Account(float amount){
        countAccounts += 1;
        this.accId = countAccounts;
        this.balance = amount;
        this.accountCreated = new Date();
    }

    public boolean deposit(float amount) {
        balance += amount;
        return true;
    }
    
    public boolean withdrawal(float amount){
        if (amount <= (this.balance-this.minimumBalance)){
            this.balance -= amount;
            return true;
        }
        else
            return false;
    }

    public float checkBalance(){
        return this.balance;
    }
    
}
