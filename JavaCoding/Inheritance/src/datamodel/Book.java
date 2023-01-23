package datamodel;

public class Book extends Product {
    public String type;
    public String publisher;
    public Book(){
        System.out.println("Book constructor is called.");
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Type: "+type+"\nPublisher: "+publisher+"\n");
    }
    public double calculate(){
        return cost * 0.9;
    }

}
