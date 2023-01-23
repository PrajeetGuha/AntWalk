package datamodel;


public class Mug {
    
    public void swirl(Liquid l){
        if (l instanceof Coffee)
            System.out.println("Coffe is poured");
        else if (l instanceof Juice)
            System.out.println("Juice is poured");
        else if (l instanceof Milk)
            System.out.println("Milk is poured");
        else
            System.out.println("Liquid is poured");
        l.swirl();
    }
}
