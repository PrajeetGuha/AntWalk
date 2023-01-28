import java.util.Scanner;

import datamodel.Customer;

public class App {

    static Scanner sc = new Scanner(System.in);
    static Customer customer;

    public static void main(String[] args) throws Exception {

        mainOptions();
    }

    private static void mainOptions() {
        int mainOption;
        do {

            System.out.println(
                    "<---------------------- Welcome to Unified Payment Portal ---------------------------------->\n");
            System.out.println("Please choose any of the following options:");
            System.out.println("1.Register as a new customer");
            System.out.println("2.Login with your credentials");
            System.out.println("3.Exit");

            System.out.print("Please enter your option: ");
            mainOption = sc.nextInt();
            sc.nextLine();

            switch (mainOption) {
                case 1: {
                    if (customer != null){
                        System.out.println("\nYou cannot add a new customer.\n");
                        break;
                    }

                    System.out.println(
                            "\n<---------------------- Customer Data Entry ---------------------------------->\n");
                    customer = new Customer();

                    System.out.print("Enter name: ");
                    customer.setName(sc.nextLine());

                    System.out.print("Enter username: ");
                    customer.setUsername(sc.nextLine());
                    System.out.println();

                    for (;;) {
                        System.out.print("Enter new password: ");
                        String password = sc.nextLine();

                        System.out.print("Retype the password: ");
                        String retype = sc.nextLine();

                        if (password.equals(retype)) {
                            customer.setPassword(password);
                            System.out.println("Password confirmed.");
                            break;
                        } else {
                            System.out.println("Password didnot match. Retry again.");
                        }
                    }
                    System.out.println();
                    System.out.print("Enter age: ");
                    customer.setAge(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter SSN: ");
                    customer.setSSN(sc.nextLine());

                    System.out.print("Enter address: ");
                    customer.setAddress(sc.nextLine());

                    System.out.print("Enter email: ");
                    customer.setEmail(sc.nextLine());

                    System.out.print("Enter phone: ");
                    customer.setPhone(sc.nextLong());

                    System.out.println("\nA Customer entry is successfully created\n");

                    break;
                }
                case 2: {
                    if (customer == null){
                        System.out.println("\nPlease register a customer first.\n");
                        break;
                    }

                    System.out.println(
                            "\n<---------------------- Customer Log In ---------------------------------->\n");

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    if (customer.login(email, password))
                        customerInteractionOptions();
                    break;
                }
                case 3:{
                    System.out.println("\nGoodByee!! Have a great day.\n");
                    break;
                }
                default:{
                    System.out.println("\nEnter a valid option!!\n");
                }
            }
        } while (mainOption != 3);
        sc.close();
    }

    private static void customerInteractionOptions() {
        int uiOption;
        do{
            System.out.println(
                            "\n<---------------------- Application GUI ---------------------------------->\n");
            System.out.println("Please choose any of the following options: ");
            System.out.println("1.Edit profile");
            System.out.println("2.Change password");
            System.out.println("3.Approve KYC");
            System.out.println("4.Add an account");
            System.out.println("5.Deposit money to account");
            System.out.println("6.Withdraw money from account");
            System.out.println("7.Check balance");
            System.out.println("8.Check details");
            System.out.println("9.Exit");

            System.out.print("Enter option: ");
            uiOption = sc.nextInt();

            switch(uiOption) {
                case 1:{
                    if (customer.editProfile())
                        System.out.println("\nProfile is successfully edited. KYC approval is required to interact with the account associated with the customer.\n");
                    else
                        System.out.println("\nNo changes are brought.\n");
                    break;
                }
                case 2:{
                    if (customer.changePassword())
                        System.out.println("\nPassword is successfully edited.\n");
                    else
                        System.out.println("\nNo changes are brought.\n");
                    break;
                }
                case 3:{
                    customer.approveKYC();
                    break;
                }
                case 4:{
                    if (customer.createAccount())
                        System.out.println("\nYour account is created successfully.\n");
                    else
                        System.out.println("\nSome issue has occured while creating the account.\n");
                    break;
                }
                case 5:{
                    System.out.print("\nEnter the amount to deposit: ");
                    float amount = sc.nextFloat();
                    sc.nextLine();
                    if (customer.deposit(amount))
                        System.out.println("\nYour amount is deposited.\n");
                    else
                        System.out.println("\nSome issue has occured while depositing the amount.\n");
                    break;
                }
                case 6:{
                    System.out.print("\nEnter the amount to withdraw: ");
                    float amount = sc.nextFloat();
                    sc.nextLine();
                    if (customer.deposit(amount))
                        System.out.println("\nYour amount is withdrawn.\n");
                    else
                        System.out.println("\nSome issue has occured while withdrawing the amount.\n");
                    break;
                }
                case 7:{
                    customer.checkBalance();
                    break;
                }
                case 8:{
                    System.out.println(customer);
                    break;
                }
                case 9:{
                    System.out.println("\nExit to Main Menu\n");
                    customer.logout();
                    break;
                }
                default:{
                    System.out.println("\nInvalid option. Try again\n");
                }
            }

        }while(uiOption != 9);
    }
}
