package datamodel;

public class Product{
    public long id;
    public String brand;
    public String name;
    public double cost;

    public Product() {
        System.out.println("Product constructor is called.");
    }
    public void display(){
        System.out.println("Id: "+id+"\nBrand: "+brand+"\nName: "+name+"\n");
    }
}