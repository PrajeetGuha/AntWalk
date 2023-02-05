package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static int cid_generator = 0;
    private int cart_id;
    private List<Product> products;
    private double total_price = 0;

    public Cart() {
        this.products = new ArrayList<Product>();
        cid_generator += 1;
        this.setCard_id(cid_generator);
    }

    public int getCard_id() {
        return cart_id;
    }

    public Cart setCard_id(int cart_id) {
        this.cart_id = cart_id;
        return this;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public Cart addProduct(Product product) {
        if (Inventory.inventory.isPresent(product)) {
            for (Product p : this.products) {
                if (p.getProduct_id() == product.getProduct_id()) {
                    p.addQty(product.getQty());
                    this.total_price += ( p.getPrice() * product.getQty() );
                    Inventory.inventory.removeProduct(product);
                    return this;
                }
            }
            Inventory.inventory.removeProduct(product);
            Product p = Inventory.inventory.getProduct(product);
            this.total_price += ( p.getPrice() * product.getQty() );
            products.add(p);
            return this;
        } else {
            System.out.println("Inventory has insufficient product");
            return this;
        }
    }

    public Cart removeProduct(Product product) {
        for (Product p : this.products) {
            if (p.getProduct_id() == product.getProduct_id()) {
                p.rmQty(product.getQty());
                this.total_price -= ( p.getPrice() * product.getQty() );
                Inventory.inventory.addProduct(product);
                return this;
            }
        }
        System.out.println("No such product exists");
        return this;
    }

    @Override
    public String toString() {
        return "Cart [card_id=" + cart_id + ", products=" + products + ", total_price=" + total_price + "]";
    }

}
