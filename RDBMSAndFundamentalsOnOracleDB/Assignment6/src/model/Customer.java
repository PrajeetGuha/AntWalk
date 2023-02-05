package model;

public class Customer {
    private static int cid_generator = 0;
    private int customer_id;
    private String name;
    private String email;
    private String phone;
    private Cart cart;

    public Customer() {
        this.cart = new Cart();
        cid_generator += 1;
        this.setCustomer_id(cid_generator);
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public Customer setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Customer addProduct(Product product) {
        this.cart.addProduct(product);
        return this;
    }

    public Customer removeProduct(Product product) {
        this.cart.removeProduct(product);
        return this;
    }

    @Override
    public String toString() {
        return "Customer [customer_id=" + customer_id + ", name=" + name + ", email=" + email + ", phone=" + phone
                + ", cart=" + cart.toString() + "]";
    }
}