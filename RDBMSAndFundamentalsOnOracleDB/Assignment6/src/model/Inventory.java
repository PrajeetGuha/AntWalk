package model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    
    public static Inventory inventory = new Inventory();
    private List<Product> products;
    private Inventory(){
        products = new ArrayList<Product>();
    }

    public List<Product> getProducts(){
        return this.products;
    }

    public Inventory addProduct(Product product){
        for(Product p : this.products){
            if (p.getProduct_id() == product.getProduct_id()){
                p.addQty(product.getQty());
                return this;
            }
        }
        System.out.println("No such product exists. Register as new product.");
        return this;
    }
    public Inventory removeProduct(Product product){
        for(Product p : this.products){
            if (p.getProduct_id() == product.getProduct_id()){
                p.rmQty(product.getQty());
                return this;
            }
        }
        System.out.println("No such product exists.");
        return this;
    }
    public Inventory registerProduct(Product product){
        this.products.add(product);
        return this;
    }

    public boolean isPresent(Product product){
        for(Product p : this.products){
            if(p.getProduct_id() == product.getProduct_id()){
                if (p.getQty() >= product.getQty()){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
    public Product getProduct(Product product){
        for(Product p : this.products){
            if(p.getProduct_id() == product.getProduct_id()){
                return p.clone(product.getQty());
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Inventory [products=" + products + "]";
    }
}
