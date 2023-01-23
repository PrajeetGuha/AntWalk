package datamodel;

public class Magazine extends Book {
    public String modeOfSale;
    public Magazine(){
        System.out.println("Magazine constructor is called.");
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Mode of Sale:"+modeOfSale+"\n");
    }
    @Override
    public double calculate(){
        return cost * 0.75;
    }
}
