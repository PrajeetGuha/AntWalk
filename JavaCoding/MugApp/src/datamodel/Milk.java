package datamodel;

public class Milk extends Liquid {
    public Milk(){
        System.out.println("Milk is called");
    }
    
    @Override
    public void swirl(){
        System.out.println("Milk is swirled");
    }
}
