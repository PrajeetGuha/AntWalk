import datamodel.Coffee;
import datamodel.Juice;
import datamodel.Liquid;
import datamodel.Milk;
import datamodel.Mug;

public class App {
    public static void main(String[] args) throws Exception {
        
        Mug m = new Mug();
        System.out.println();
        Liquid l = new Liquid();
        System.out.println();
        Juice j = new Juice();
        System.out.println();
        Milk mi = new Milk();
        System.out.println();
        Coffee c = new Coffee();
        System.out.println();

        m.swirl(l);
        System.out.println();
        m.swirl(j);
        System.out.println();
        m.swirl(mi);
        System.out.println();
        m.swirl(c);
        
    }
}
