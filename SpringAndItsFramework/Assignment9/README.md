# Assignment 9

NOTE: Since I was having problem in starting a spring based maven project in VSCode, it initiated a Spring Boot based project and then did the required assignment.

## Objective
Create a new Spring Application. The details are as follows.


 - Add a class named Customer in the src/main/java with all following attributes
     - Name-String
     - Username-String
     - Password-String
     - Age-int
     - SSN-String
     - Address-String(just city name)
     - Email-String
     - Phone-long
     - Balance-float

- Create an interface Account with showAccount() method.
- Inject Account interface in Customer class using @Autowired
- Create two classes Saving and Current implementing Account interface.
- Inject Saving/ Current account using @Qualifier while creating a customer.


Note:
           Make use of @Bean @Component @ComponentScan @Configuration as needed, Create packages and sub-packages as needed.

## Terminal Output

```
PS C:\Users\RICK\Documents\AntWalk\bankingapp>  C:; cd 'C:\Users\RICK\Documents\AntWalk\bankingapp'; & 'C:\Users\RICK\.vscode\extensions\redhat.java-1.14.0-win32-x64\jre\17.0.5-win32-x86_64\bin\java.exe' '@C:\Users\RICK\AppData\Local\Temp\cp_8m61whlrqltgg8uxphcfruo31.argfile' 'org.nrifintech.bankingapp.BankingappApplication'

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.2)

2023-02-12T17:55:49.995+05:30  INFO 9480 --- [           main] o.n.bankingapp.BankingappApplication     : Starting BankingappApplication using Java 17.0.5 with PID 9480 (C:\Users\RICK\Documents\AntWalk\bankingapp\target\classes started by RICK in C:\Users\RICK\Documents\AntWalk\bankingapp)
2023-02-12T17:55:49.999+05:30  INFO 9480 --- [           main] o.n.bankingapp.BankingappApplication     : No active profile set, falling back to 1 default profile: "default"
2023-02-12T17:55:50.414+05:30  INFO 9480 --- [           main] o.n.bankingapp.BankingappApplication     : Started BankingappApplication in 0.707 seconds (process
running for 1.015)
Enter Login Details:-
Username: prajeetguha
Password: abcd
LOGGED IN SUCCESSFULLY


Enter Personal Details
Name: prajeet
Age: 12
Address: lenin street
Email: abc@gmail.com
Phone: 1234567890
SSN: 0987654321

**********USER PROFILE********
Name: prajeet
Age: 12
Address: lenin street
Email: abc@gmail.com
Phone: 1234567890
SSN No: 0987654321

Enter the type of account you wanna open:
Type c for current OR s for saving: s
Enter the amount you wanna deposit: 2000
Amount deposited
Enter the amount you wanna withdraw: 100
Amount withdrawn

-------------ACCOUNT DETAILS-----------
SAVING ACCOUNT
Balance: 1900.0

PS C:\Users\RICK\Documents\AntWalk\bankingapp>
```

The jar file can be used to locally run the application.
