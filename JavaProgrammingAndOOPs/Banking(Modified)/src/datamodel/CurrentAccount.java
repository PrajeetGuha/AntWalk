package datamodel;

public class CurrentAccount extends Account {

    public CurrentAccount(float amount) {
        super(amount);
        super.minimumBalance = 1000;
    }

    @Override
    public String display(){
        return ("\nAccount Id: "+super.accId+"\nBalance: "+super.balance+"\nAccount Created on: "+super.accountCreated+"\nMinimum Balance Required: "+super.minimumBalance+"\n");
    }

}