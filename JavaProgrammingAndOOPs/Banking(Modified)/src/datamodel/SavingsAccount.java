package datamodel;

public class SavingsAccount extends Account {

    public SavingsAccount(float amount) {
        super(amount);
        this.minimumBalance = 0;
    }

    @Override
    public String display(){
        return ("\nAccount Id: "+super.accId+"\nBalance: "+super.balance+"\nAccount Created on: "+super.accountCreated+"\nMinimum Balance Required: "+super.minimumBalance+"\n");
    }
}