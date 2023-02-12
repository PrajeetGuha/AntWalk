package org.nrifintech;

public class Interest {
    public double simIntCalculate(double p, double r, int t, String duration){

        double interest = ( (duration == "year") ? ((p * r * t) / 100) : ((p * r * t) / 1200));
        double total_amount = p + interest;
        return total_amount;
    }
}
