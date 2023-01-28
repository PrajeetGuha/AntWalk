package datamodel;

import java.util.Scanner;

import interfaces.Validation;

public class Customer implements Validation {
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

    public Customer() {
        this.bank = new Bank();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public boolean login(String email, String password) {
        if (email.equals(this.email) && password.equals(this.password)) {
            this.successfullylogged = true;
            System.out.println("\nSuccessfully Logged In\n");
            return true;
        } else {
            System.out.println("\nFailed to Log In\n");
            return false;
        }
    }

    public boolean deposit(float amount) {
        if (this.successfullylogged) {
            return this.bank.deposit(amount);
        } else {
            return false;
        }
    }

    public boolean withdraw(float amount) {
        if (this.successfullylogged) {
            return this.bank.withdraw(amount);
        } else {
            return false;
        }
    }

    public void checkBalance() {
        if (this.successfullylogged) {
            this.bank.checkBalance();
        }
    }

    public boolean editProfile(Scanner sc) {
        int option;
        do {
            System.out.print(
                    "\nEdit Profile:(NOTE: Any changes will require approval from bank before the account is activated again for transaction)\n1.Change name\n2.Change address\n3.Change phone\n4.Change age\n5.Done\nEnter your option:");
            option = sc.nextInt();
            sc.nextLine();
            if (option >= 1 && option <= 4)
                this.bank.profileChange();
            switch (option) {
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
                    System.out.println();
                    break;
                default:
                    System.out.println("Wrong option choosen.");
            }
        } while (option != 5);
        return true;
    }

    public boolean changePassword(Scanner sc) {
        if (successfullylogged) {
            System.out.print("Enter old password: ");
            String oldPassword = sc.nextLine();
            if (oldPassword.compareTo(this.password) == 0) {
                System.out.print("Enter new password: ");
                String newPassword = sc.nextLine();
                System.out.print("Enter confirm password: ");
                String confirmNewPassword = sc.nextLine();
                if (newPassword.compareTo(confirmNewPassword) == 0) {
                    this.password = newPassword;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean createAccount(Scanner sc) {
        if (this.successfullylogged) {
            return this.bank.createAccount(sc);
        } else {
            return false;
        }
    }

    public void approveKYC(){
        this.bank.profileApproved();
    }

    public boolean logout() {
        successfullylogged = false;
        return true;
    }

    @Override
    public boolean validateSSN(String SSN){
        return SSN.length() == 9;
    }

    @Override
    public boolean validateAge(int age){
        return age > 18;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", username=" + username + ", age=" + age + ", address=" + address
                + ", email=" + email + ", phone=" + phone + ", bank=" + bank + "]";
    }
}