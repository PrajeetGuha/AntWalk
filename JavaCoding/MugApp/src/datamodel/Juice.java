package datamodel;

public class Juice extends Liquid {
    public Juice(){
        System.out.println("Juice is called");
    }
    
    @Override
    public void swirl(){
        System.out.println("Juice is swirled");
    }
}
