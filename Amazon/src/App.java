import java.util.Scanner;

import datamodel.Customer;
import datamodel.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        // USER INPUT FOR DATA
        System.out.print("Enter age:");
        customer.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter name:");
        customer.setName(scanner.nextLine());
        System.out.print("Enter address:");
        customer.setAddress(scanner.nextLine());
        System.out.print("Enter phone number:");
        customer.setPhoneNo(scanner.nextLine());
        System.out.print("Enter email address:");
        customer.setEmailAddress(scanner.nextLine());

        // NUMBER OF UNIQUE PRODUCTS TO TAKE
        System.out.print("Enter number of unique products to add:");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            Product product = new Product();

            // USER INPUT FOR DATA
            System.out.println("Product " + (i + 1) + ":");
            System.out.print("Enter product name:");
            product.setProductname(scanner.nextLine());
            System.out.print("Enter brand name:");
            product.setBrand(scanner.nextLine());
            System.out.print("Enter supplier name:");
            product.setSupplier(scanner.nextLine());
            System.out.print("Enter count:");
            product.setCount(scanner.nextInt());
            scanner.nextLine();

            // ADD PRODUCT TO BASKET
            customer.addToBasket(product);
        }

        customer.checkout();
        scanner.close();
    }
}
