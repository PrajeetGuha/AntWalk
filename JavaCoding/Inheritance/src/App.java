import datamodel.Book;
import datamodel.Electronic;
import datamodel.Magazine;
import datamodel.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Book book = new Book();
        System.out.println();
        Electronic electronic = new Electronic();
        System.out.println();
        Magazine magazine = new Magazine();
        System.out.println();
        Product product = new Product();
        System.out.println();

        book.id = 1;
        book.name = "FairyTale";
        book.publisher = "JP";
        book.cost = 123;

        electronic.brand = "LG";
        electronic.id = 2;
        electronic.name = "Fan";
        electronic.power = 120;
        electronic.cost = 1000;

        magazine.brand = "Vogue";
        magazine.cost = 200;
        magazine.id = 3;
        magazine.modeOfSale = "online";
        magazine.name = "Fanshion";

        product.brand = "Koogle";
        product.cost = 20;
        product.id = 4;
        product.name = "Ball";

        product.display();
        electronic.display();
        book.display();
        magazine.display();

        System.out.println("Book Cost: "+book.calculate()+"\nMagazine cost: "+magazine.calculate());
    }
}
