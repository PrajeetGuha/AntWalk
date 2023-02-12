package org.nrifintech.bankingapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.nrifintech.bankingapp.models.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BankingappApplication {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ConfigurableApplicationContext context = SpringApplication.run(BankingappApplication.class, args);

		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Customer c = context.getBean("cus",Customer.class);
		
		System.out.println("Enter Login Details:- ");
		System.out.print("Username: ");
		String username = br.readLine();
		System.out.print("Password: ");
		String password = br.readLine();
		
		c.login(username, password);
		System.out.println();
 
		System.out.println("Enter Personal Details");
		System.out.print("Name: ");
		c.setName(br.readLine());
		
		System.out.print("Age: ");
		c.setAge(Integer.parseInt(br.readLine()));
		
		System.out.print("Address: ");
		c.setAddress(br.readLine());
		
		System.out.print("Email: ");
		c.setEmail(br.readLine());
		
		System.out.print("Phone: ");
		c.setPhone(Integer.parseInt(br.readLine()));
		
		System.out.print("SSN: ");
		c.setSsn(br.readLine());
		
		c.viewProfile();
		
		System.out.println("\nEnter the type of account you wanna open: ");
		System.out.print("Type c for current OR s for saving: ");
		
		c.type(br.readLine().toLowerCase());
		
		System.out.print("Enter the amount you wanna deposit: ");
		c.deposit(Float.parseFloat(br.readLine()));
	
		
		System.out.print("Enter the amount you wanna withdraw: ");
		c.withdraw(Float.parseFloat(br.readLine()));
		
		c.getBalance();
		System.out.println();
  		context.close();
		
	}
}
