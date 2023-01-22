package datamodel;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    // 5 ATTRIBUTES WITH THERE GETTER AND SETTERS
    private String name;
    private Integer age;
    private String address;
    private String phoneNo;
    private String emailAddress;

    // CUSTOMER BASKET
    private List<Product> products;

    public Customer() {
        products = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    // TO REGISTER
    public Boolean register() {
        System.out.println("The customer is successfully registered.");
        return true;
    }

    // TO LOGIN
    public Boolean login() {
        System.out.println("The customer successfully logs in.");
        return true;
    }

    // TO ADD ITEMS TO THE BASKET
    public Boolean addToBasket(Product product) {
        this.products.add(product);
        System.out.println("Added to the Basket:\n" + product);
        return true;
    }

    // TO REMOVE ITEMS FROM THE BASKET
    public Boolean removeFromBasket(Product product, Integer count) {
        product.reduceCount(count);
        if (product.getCount() == 0)
            products.remove(product);
        System.out.println("Removed from the Basket:\n" + product);
        return true;
    }

    // TO CHECK THE BASKET
    public Boolean checkout() {
        System.out.println("Products in the Basket:");
        for (Product p : products) {
            System.out.println(p + "\n");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + this.age + "\nAddress: " + this.address + "\nPhone No.:"
                + this.phoneNo + "\nEmail Address:" + this.emailAddress;
    }
}
