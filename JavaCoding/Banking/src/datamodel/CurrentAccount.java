package datamodel;

public class CurrentAccount extends Account{

    public CurrentAccount(float amount) {
        super(amount);
        super.minimumBalance = 1000;
    }
    
}
