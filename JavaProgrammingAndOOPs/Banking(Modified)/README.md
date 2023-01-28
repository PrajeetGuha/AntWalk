# Assignment 4

This assignment is the extension of [Assignment 3](https://github.com/PrajeetGuha/AntWalk/tree/main/JavaProgrammingAndOOPs/Banking).

## Additional Requirements
- Change the Account class to an abstract class, with display as abstract method.
- Add an interface named Validation with two methods - 
  - validateSSN() : This should validate if the the SSN number has 9 digits
  - validateAge() : This will validate if the the age of customer is greater than 18 year to open an account.
- Implement Validation methods in customer class.

All documentation associated with the code is present in Assignment 3. Additiona aspects are -
- Customer class has 2 additional methods - `validateSSN()` and `validateAge()`. Customer data entry will validate the SSN and age given by the user.
- There is an additional package called `interfaces.Validation`
- The Account class is abstracted and an additional `display()` method is created in each subclasses to implement the abstract method.

**Output in the terminal - (NOTE: Only new features and additions are shown below. The other features are shown in Assignment 3. Please refer to Assignment 3 documentation for others)**
```
PS C:\Users\RICK\Documents\AntWalk\Banking(Modified)> cd "c:\Users\RICK\Documents\AntWalk\Banking(Modified)\src\" ; if ($?) { javac App.java } ; if ($?) { java App }
<---------------------- Welcome to Unified Payment Portal ---------------------------------->

Please choose any of the following options:
1.Register as a new customer
2.Login with your credentials
3.Exit
Please enter your option: 1

<---------------------- Customer Data Entry ---------------------------------->

Enter name: prajeet
Enter username: prajeet

Enter new password: abcd
Retype the password: abcd
Password confirmed.

Enter age: 12

Age is not matching criteria(18+ age) to create account in the bank.

Enter age: 20
Enter SSN: 1234

SSN is not matching criteria(9 digits) to create account in the bank.

Enter SSN: 123456789
Enter address: kolkata
Enter email: abcd@gmail.com
Enter phone: 1234567890

A Customer entry is successfully created

<---------------------- Welcome to Unified Payment Portal ---------------------------------->

Please choose any of the following options:
1.Register as a new customer
2.Login with your credentials
3.Exit
Please enter your option: 2

<---------------------- Customer Log In ---------------------------------->

Enter email: abcd@gmail.com
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
Enter option: 4

Enter initial deposit amount: 200

<---------------------- Account Creation ---------------------------------->


Type of Account:
1.Savings
2.Current
3.Exit
Enter option: 1

Savings account is created


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
Enter option: 7
The balance in the account is: 200.0

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
Customer [name=prajeet, username=prajeet, age=20, address=kolkata, email=abcd@gmail.com, phone=1234567890, bank=Bank [KYC=true, account=
Account Id: 1
Balance: 200.0
Account Created on: 2023-01-29
Minimum Balance Required: 0.0
]]

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

PS C:\Users\RICK\Documents\AntWalk\Banking(Modified)\src>
```
