import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String crdno = sc.next();
        if (crdno.length() != 16)
            throw new InvalidCreditCardNumberException();
    }
}
