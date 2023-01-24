package datamodel;

import java.util.Date;

public class FixedAccount extends Account {

    private int withdrawalDuration = 1;
    public FixedAccount(float amount) {
        super(amount);
        this.minimumBalance = 1000;        
    }

    @Override
    public boolean withdrawal(float amount){
        Date today = new Date();
        long val = today.getTime() - accountCreated.getTime();
    }
    
}
