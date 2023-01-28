# Assignment 3

## Objective
To create a terminal-based banking application.

## Requirements
Create an simple java applications with three classes - 
- Customer(this class contain information about customers)
- Bank(This will be the main class,which when executed shows following results)
- Account(This class contains the account details of the customer in the bank)

Create two subclasses of Account class

### Customer Class
Attributes - 
- Name-String
- Username-String
- Password-String
- Age-int
- SSN-String
- Address-String(just city name)
- Email-String
- Phone-long
- Balance-float

Methods - 
- login
- deposit
- withdrawal
- checkBalance
- editProfile
- changePassword

### Bank Class
No such requirements specified.

### Account Class
Attributes - 
- accountId - Int
- description
- minimumBalance - float

Methods - 
- displayAccount

### Functional Requirements
- On the start of application login() method of Customer class should be called.
- After logging in,customer should select one of the following option to perform operation.
- On selection of each opeeration,respecting methods in customer class should be called.
- At the end of each operation the customer should be prompted,do you want to continue?
- If the reply is "YES" then it should display the menu again.
- If the answer is "NO" then it should exit out and display the login page.

## Implementation
**The class diagram is given below -**
![class-diagram](https://user-images.githubusercontent.com/58776463/215268456-32da744b-bdf6-40df-b9aa-0e0fd7672444.png)

Account class has 2 subclasses.
- CurrentAccount(with minimum balance 1000)
- SavingsAccount(with no minimum balance)

**The workflow diagram is given below -**
![Start the app](https://user-images.githubusercontent.com/58776463/215273519-0cd4ff36-e327-42b0-9977-d3f9bf335e70.png)

**Output in the terminal -**
```
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\RICK\Documents\AntWalk\Banking>  & 'C:\Program Files\Java\jdk-16.0.2\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\RICK\Documents\AntWalk\Banking\bin' 'App'
<---------------------- Welcome to Unified Payment Portal ---------------------------------->

Please choose any of the following options:
1.Register as a new customer
2.Login with your credentials
3.Exit
Please enter your option: 2

Please register a customer first.

<---------------------- Welcome to Unified Payment Portal ---------------------------------->

Please choose any of the following options:
1.Register as a new customer
2.Login with your credentials
3.Exit
Please enter your option: 1

<---------------------- Customer Data Entry ---------------------------------->

Enter name: prajeet
Enter username: prajeetg

Enter new password: abcd
Retype the password: pqrs
Password didnot match. Retry again.
Enter new password: abcd
Retype the password: abcd
Password confirmed.

Enter age: 22
Enter SSN: 12345
Enter address: kolkata
Enter email: prajeetguha@gmail.com
Enter phone: 1234567890

A Customer entry is successfully created

<---------------------- Welcome to Unified Payment Portal ---------------------------------->

Please choose any of the following options:
1.Register as a new customer
2.Login with your credentials
3.Exit
Please enter your option: 1

You cannot add a new customer.

<---------------------- Welcome to Unified Payment Portal ---------------------------------->

Please choose any of the following options:
1.Register as a new customer
2.Login with your credentials
3.Exit
Please enter your option: 2

<---------------------- Customer Log In ---------------------------------->

Enter email: prajeetguha@gmail.com
Enter password: pqrs

Failed to Log In

<---------------------- Welcome to Unified Payment Portal ---------------------------------->

Please choose any of the following options:
1.Register as a new customer
2.Login with your credentials
3.Exit
Please enter your option: 2

<---------------------- Customer Log In ---------------------------------->

Enter email: prajeetguha@gmail.com
Enter password: abcd

Successfully Logged In


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 7

There is no account


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 1

Edit Profile:(NOTE: Any changes will require approval from bank before the account is activated again for transaction)
1.Change name
2.Change address
3.Change phone
4.Change age
5.Done
Enter your option:3

Profile is changed. You need KYC to transact with the account.

Enter new phone: 0987654321

Edit Profile:(NOTE: Any changes will require approval from bank before the account is activated again for transaction)
1.Change name
2.Change address
3.Change phone
4.Change age
5.Done
Enter your option:5


Profile is successfully edited. KYC approval is required to interact with the account associated with the customer.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 4

Some issue has occured while creating the account.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 3

KYC approved.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 2
Enter old password: abcd
Enter new password: pqrs
Enter confirm password: pqrs

Password is successfully edited.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 4

Enter initial deposit amount: 1200

<---------------------- Account Creation ---------------------------------->


Type of Account:
1.Savings
2.Current
3.Exit
Enter option: 2

Current account is created


Your account is created successfully.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 4

Some issue has occured while creating the account.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 5

Enter the amount to deposit: 1200

Your amount is deposited.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 7
The balance in the account is: 2400.0

<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 6

Enter the amount to withdraw: 3000

Insufficient balance.


Some issue has occured while withdrawing the amount.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 7
The balance in the account is: 2400.0

<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 6

Enter the amount to withdraw: 400

Your amount is withdrawn.


<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 7
The balance in the account is: 2000.0

<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 8
Customer [name=prajeet, username=prajeetg, age=22, address=kolkata, email=prajeetguha@gmail.com, phone=987654321, bank=Bank [KYC=true, account=Account [accId=1, balance=2000.0, accountCreated=2023-01-28, minimumBalance=1000.0]]]

<---------------------- Application GUI ---------------------------------->

Please choose any of the following options:
1.Edit profile
2.Change password
3.Approve KYC
4.Add an account
5.Deposit money to account
6.Withdraw money from account
7.Check balance
8.Check details
9.Exit
Enter option: 9

Exit to Main Menu

<---------------------- Welcome to Unified Payment Portal ---------------------------------->

Please choose any of the following options:
1.Register as a new customer
2.Login with your credentials
3.Exit
Please enter your option: 3

GoodByee!! Have a great day.


PS C:\Users\RICK\Documents\AntWalk\Banking>
```

Thank you. Have a nice day!! 😃
