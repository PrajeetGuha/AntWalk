package datamodel;

import javax.swing.ImageIcon;

public class Product {

    // 5 ATTRIBUTES WITH THERE GETTERS AND SETTERS
    private String productname;
    private ImageIcon productimage;
    private String brand;
    private String supplier;
    private Integer count;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public ImageIcon getProductimage() {
        return productimage;
    }

    public void setProductimage(ImageIcon productimage) {
        this.productimage = productimage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    // TO REDUCE COUNT
    public Boolean reduceCount(Integer val) {
        this.count -= val;
        return true;
    }

    @Override
    public String toString() {
        return "Product Name: " + this.productname + "\nBrand: " + this.brand + "\nSupplier: " + this.supplier
                + "\nNumber of items of this type: " + this.count;
    }
}
