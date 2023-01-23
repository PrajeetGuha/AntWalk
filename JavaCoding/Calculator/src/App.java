import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int opt;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Choose any options from below:\n1.Add\n2.Substract\n3.Multiply\n4.Divide\n5.Exit");
            opt = sc.nextInt();
            System.out.print("Enter number 1:");
            double a = sc.nextDouble();
            System.out.print("Enter number 2: ");
            double b = sc.nextDouble();
            switch(opt){
                case 1 :
                System.out.println(a+b);
                break;

                case 2:
                System.out.println(a-b);
                break;

                case 3:
                System.out.println(a*b);
                break;

                case 4:
                System.out.println(a/b);
                break;

                case 5:
                break;

                default:
                System.out.println("Incorrect option.");
            }
        }while(opt != 5);
        sc.close();
    }
}
