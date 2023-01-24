package datamodel;

import java.util.Scanner;

public class Customer{
    private String name;
    private String username;
    private String password;
    private int age;
    private String SSN;
    private String address;
    private String email;
    private long phone;
    private Bank bank;
    private boolean successfullylogged = false;

    public boolean login(String email, String password){
        if (email.compareTo(this.email) == 0 && password.compareTo(this.password) == 0){
            this.successfullylogged = true;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean deposit(float amount){
        if (this.successfullylogged){
            return this.bank.deposit(amount);
        }
        else{
            return false;
        }
    }

    public boolean withdrawal(float amount){
        if (this.successfullylogged){
            return this.bank.withdrawal(amount);
        }
        else{
            return false;
        }
    }

    public void checkBalance(){
        if (this.successfullylogged){
            this.bank.checkBalance();
        }
    }

    public boolean editProfile(){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            System.out.print("\nEdit Profile:(NOTE: Any changes will require approval from bank before the account is activated again for transaction)\n1.Change name\n2.Change address\n3.Change phone\n4.Change age\n5.Done\nEnter your option:");
            option = sc.nextInt();
            sc.nextLine();
            if (option >= 1 && option <= 4)
                this.bank.profileChange();
            switch(option){
                case 1:
                    System.out.print("Enter new name: ");
                    this.name = sc.nextLine();
                    break;
                case 2:
                    System.out.print("Enter new address: ");
                    this.address = sc.nextLine();
                    break;
                case 3:
                    System.out.print("Enter new phone: ");
                    this.phone = sc.nextLong();
                    sc.nextLine();
                    break;
                case 4:
                    System.out.print("Enter new age: ");
                    this.age = sc.nextInt();
                    sc.nextLine();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong option choosen.");
            }
        }while(option != 5);
        sc.close();
        return true;
    }

    public boolean changePassword(){
        Scanner sc = new Scanner(System.in);
        if (successfullylogged){
            System.out.print("Enter old password: ");
            String oldPassword = sc.nextLine();
            if (oldPassword.compareTo(this.password) == 0){
                System.out.print("Enter new password: ");
                String newPassword = sc.nextLine();
                System.out.print("Enter confirm password: ");
                String confirmNewPassword = sc.nextLine();
                if (newPassword.compareTo(confirmNewPassword) == 0){
                    this.password = newPassword;
                    sc.close();
                    return true;
                }
            }            
        }
        sc.close();
        return false;
    }

    public boolean createAccount(){
        if (this.successfullylogged){
            return this.bank.createAccount();
        }
        else{
            return false;
        }
    }

    public boolean logout(){
        successfullylogged = false;
        return true;
    }
}