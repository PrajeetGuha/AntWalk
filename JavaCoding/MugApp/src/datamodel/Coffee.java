package datamodel;

public class Coffee extends Liquid {
    public Coffee(){
        System.out.println("Coffee is called");
    }
    
    @Override
    public void swirl(){
        System.out.println("Coffee is swirled");
    }
}
