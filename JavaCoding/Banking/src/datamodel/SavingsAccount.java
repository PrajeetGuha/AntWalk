package datamodel;

public class SavingsAccount extends Account {

    public SavingsAccount(float amount) {
        super(amount);
        this.minimumBalance = 0;
    }
    
}
