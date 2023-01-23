package datamodel;

public class Electronic extends Product {
    public long power;
    public int starRating;
    public Electronic(){
        System.out.println("Electronic constructor is called.");
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Power: "+power+"\nStar Rating: "+starRating+"\n");
    }
}
