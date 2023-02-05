import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Customer;
import model.Inventory;
import model.Product;

public class App {
    public static void main(String[] args) throws Exception {
        List<Customer> customers = new ArrayList<Customer>();
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.println("Choose an option: ");
            System.out.println("1. Add a customer(Register new customer)");
            System.out.println("2. Add a product to the inventory(Product is already registered)");
            System.out.println("3. Remove a product from the inventory");
            System.out.println("4. See all customers");
            System.out.println("5. Add a product to a customer's cart");
            System.out.println("6. Remove a product from customer's cart");
            System.out.println("7. Add new product to the inventory(Register new product)");
            System.out.println("8. Show all products in inventory");
            System.out.println("9. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1:
                    Customer customer = new Customer();
                    System.out.print("Enter name: ");
                    customer.setName(sc.nextLine());
                    System.out.print("Enter email: ");
                    customer.setEmail(sc.nextLine());
                    System.out.print("Enter phone: ");
                    customer.setPhone(sc.nextLine());
                    customers.add(customer);
                    break;
                case 2:
                    Product productadd = new Product(false);
                    System.out.print("Enter product_id: ");
                    productadd.setProduct_id(sc.nextInt());
                    System.out.print("Enter quantity to add: ");
                    productadd.setQty(sc.nextInt());
                    sc.nextLine();
                    Inventory.inventory.addProduct(productadd);
                    break;
                case 3:
                    Product productremove = new Product(false);
                    System.out.print("Enter product_id: ");
                    productremove.setProduct_id(sc.nextInt());
                    System.out.print("Enter quantity to remove: ");
                    productremove.setQty(sc.nextInt());
                    sc.nextLine();
                    Inventory.inventory.removeProduct(productremove);
                    break;
                case 4:
                    System.out.println(customers);
                    break;
                case 5:
                    System.out.print("Enter customer id: ");
                    int id = sc.nextInt();
                    Product productToAdd = new Product(false);
                    System.out.print("Enter product id: ");
                    productToAdd.setProduct_id(sc.nextInt());
                    System.out.print("Quantity: ");
                    productToAdd.setQty(sc.nextInt());

                    sc.nextLine();
                    for(Customer c : customers){
                        if (c.getCustomer_id() == id){
                            c.addProduct(productToAdd);
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter customer id: ");
                    int id_ = sc.nextInt();
                    Product productToRemove = new Product(false);
                    System.out.print("Enter product id: ");
                    productToRemove.setProduct_id(sc.nextInt());
                    System.out.print("Quantity To remove: ");
                    productToRemove.setQty(sc.nextInt());

                    sc.nextLine();
                    for(Customer c : customers){
                        if (c.getCustomer_id() == id_){
                            c.removeProduct(productToRemove);
                        }
                    }
                    break;
                case 7:
                    Product newproduct = new Product(true);
                    System.out.print("Enter product name: ");
                    newproduct.setName(sc.nextLine());
                    System.out.print("Enter product brand: ");
                    newproduct.setBrand(sc.nextLine());
                    System.out.print("Enter product quantity: ");
                    newproduct.setQty(sc.nextInt());
                    System.out.print("Enter product price: ");
                    newproduct.setPrice(sc.nextDouble());
                    sc.nextLine();
                    Inventory.inventory.registerProduct(newproduct);
                    break;
                case 8:
                    System.out.println(Inventory.inventory);
                    break;
                case 9:
                    System.out.println("GoodByee!!");
                    break;
                default:
                    System.out.println("Wrong option.");
            }
        }while(option != 9);
    }
}
