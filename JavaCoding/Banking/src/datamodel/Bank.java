package datamodel;

import java.util.Scanner;

public class Bank {

    private boolean KYC = false;
    private Account account;

    public boolean withdrawal(float amount){
        if(this.KYC){
            return this.account.withdrawal(amount);
        }
        else{
            return false;
        }
    }

    public boolean deposit(float amount){
        if(this.KYC){
            return this.account.deposit(amount);
        }
        else{
            return false;
        }
    }

    public void checkBalance(){
        System.out.println("The balance in the account is: "+this.account.checkBalance());
    }

    public void profileChange(){
        this.KYC = false;
        System.out.println("\nProfile is changed. You need KYC to transact with the account.\n");
    }

    public void profileApproved(){
        System.out.println("\nKYC approved.\n");
        this.KYC = true;
    }

    public boolean createAccount(){
        if (this.KYC && this.account == null){
            Scanner sc = new Scanner(System.in);
            int option;
            float amount;
            do{
                System.out.println("\nType of Account:\n1.Savings\n2.Current\n3.Fixed\nEnter option: ");
                option = sc.nextInt();
                sc.nextLine();
                amount = sc.nextInt();
                sc.nextLine();
                switch(option){
                    case 1:
                        this.account = new SavingsAccount(amount);
                        System.out.println("\nSavings account is created\n");
                        break;
                    case 2:
                        if (amount >= 1000){
                            this.account = new CurrentAccount(amount);
                            System.out.println("\nCurrent account is created\n");
                        }
                        else{
                            System.out.println("\nGiven amount does not match minimum balance required to make a current account\n");
                        }
                        break;
                    case 3:
                        if (amount >= 1000){
                            this.account = new CurrentAccount(amount);
                            System.out.println("\nFixed account is created\n");
                        }
                        else{
                            System.out.println("\nGiven amount does not match minimum balance required to make a fixed account\n");
                        }
                }
            }
        }
    }
}
