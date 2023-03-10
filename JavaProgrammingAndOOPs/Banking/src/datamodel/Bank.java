package datamodel;

import java.util.Scanner;

public class Bank {

    private boolean KYC = false;
    private Account account;

    public boolean withdraw(float amount) {
        if (this.KYC && this.account != null) {
            return this.account.withdraw(amount);
        } else {
            return false;
        }
    }

    public boolean deposit(float amount) {
        if (this.KYC && this.account != null) {
            return this.account.deposit(amount);
        } else {
            return false;
        }
    }

    public void checkBalance() {
        if (this.account != null)
            System.out.println("The balance in the account is: " + this.account.checkBalance());
        else
            System.out.println("\nThere is no account\n");
    }

    public void profileChange() {
        this.KYC = false;
        System.out.println("\nProfile is changed. You need KYC to transact with the account.\n");
    }

    public void profileApproved() {
        System.out.println("\nKYC approved.\n");
        this.KYC = true;
    }

    public boolean createAccount(Scanner sc) {
        if (this.KYC && this.account == null) {
            int option;
            float amount;
            System.out.print("\nEnter initial deposit amount: ");
            amount = sc.nextFloat();
            sc.nextLine();
            do {
                System.out.println(
                            "\n<---------------------- Account Creation ---------------------------------->\n");
                System.out.print("\nType of Account:\n1.Savings\n2.Current\n3.Exit\nEnter option: ");
                option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        this.account = new SavingsAccount(amount);
                        System.out.println("\nSavings account is created\n");
                        option = 3;
                        break;
                    case 2:
                        if (amount >= 1000) {
                            this.account = new CurrentAccount(amount);
                            System.out.println("\nCurrent account is created\n");
                            option = 3;
                        } else {
                            System.out.println(
                                    "\nGiven amount does not match minimum balance required to make a current account\n");
                        }
                        break;
                    case 3:
                        System.out.println("\nThank You!!\n");
                        break;
                    default:
                        System.out.println("\nWrong input. Try again.\n");
                }
            } while (option != 3);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bank [KYC=" + KYC + ", account=" + account + "]";
    }
}