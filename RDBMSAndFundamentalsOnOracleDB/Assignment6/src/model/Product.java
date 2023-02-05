package model;

public class Product {
    private static int pid_generator = 0;
    private int product_id;
    private String name;
    private String brand;
    private double price;
    private int qty;
    public Product(boolean newproduct){
        if (newproduct){
            pid_generator += 1;
            this.setProduct_id(pid_generator);
        }
    }

    public Product clone(int qty){
        Product p = new Product(false);
        p.setProduct_id(this.product_id);
        p.setName(this.name);
        p.setBrand(this.brand);
        p.setPrice(this.price);
        p.setQty(qty);
        return p;
    }
    
    public int getProduct_id() {
        return product_id;
    }
    public Product setProduct_id(int product_id) {
        this.product_id = product_id;
        return this;
    }
    public String getName() {
        return name;
    }
    public Product setName(String name) {
        this.name = name;
        return this;
    }
    public String getBrand() {
        return brand;
    }
    public Product setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public Product setQty(int qty) {
        this.qty = qty;
        return this;
    }
    public Product addQty(int qty){
        this.qty += qty;
        return this;
    }
    public Product rmQty(int qty){
        if (this.qty < qty){
            System.out.println("WARNING: More products are removed than available. Number of products removed = " + this.qty);
            this.qty = 0;
        }
        else{
            this.qty -= qty;
        }
        return this;
    }
    @Override
    public String toString() {
        return "Product [product_id=" + product_id + ", name=" + name + ", brand=" + brand + ", price=" + price
                + ", qty=" + qty + "]";
    }
}
