# Assignment 5

## Objective 1

Create a terminal application that allows user to insert or update data in the database from the command prompt.

## Requirements

- Insert 5 records into Student buy accepting values from each column from the user
- After every record insertion we should confirm from the customer do you want to continue?If he says yes,go on and insert a new record,otherwise exit.
Update a record in the table by accepting - 
  - The field that has to be updated and the value it should be updated to.
  - The condition that the record should satisfy in order for it to be updated.
  
## Tools Used

- `Java` for implementing the interface logic between the user and the database.
- `MySQL` as DBMS.

## Implementation

1. Created a `Student` Class specifying all the fields as attributes and creating their own getter and setter. It will be used as ORM.
2. Created a `JDBC` Class for connection-related aspects with MySQL Database.
3. Created a `StudentRepository` Class that implements all insertion and updation methods required to interact with the Student table. It also creates the Student table if it is not already created in the database.
4. Objects of above classes are created in `App` class. It is the entry point for the application.

The flow of data - 
![data-flow](https://user-images.githubusercontent.com/58776463/216804600-8cc13b36-7d28-446b-92e8-b5a62acba142.png)

## Limitations

- The conditions are limited to only equality-based conditions
- Subquery-based conditions cannot be given
- Allows only insertion and updation but no deletion

## Output

### Terminal Output

```
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

PS C:\Users\RICK\Documents\AntWalk\Assignment5>  & 'C:\Program Files\Java\jdk-16.0.2\bin\java.exe' '@C:\Users\RICK\AppData\Local\Temp\cp_6q5puiqjdgdvkjlpr3srgb0zo.argfile' 'App'
Executed : CREATE TABLE IF NOT EXISTS Student( ID INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), age INT, email VARCHAR(50), phone VARCHAR(10));

Choose option:
1. Insert Record
2. Update Record
3. Exit
Choose option: 1

Enter name: ritisha
Enter age: 23
Enter email: ritisha23@infro.com
Enter phone: 4536271890
Record is added: INSERT INTO Student(name, age, email, phone) VALUES('ritisha', 23, 'ritisha23@infro.com', '4536271890');

Choose option:
1. Insert Record
2. Update Record
3. Exit
Choose option: 1

Enter name: jayant
Enter age: 45
Enter email: jayant45@infro.com
Enter phone: 4637281950
Record is added: INSERT INTO Student(name, age, email, phone) VALUES('jayant', 45, 'jayant45@infro.com', '4637281950');

Choose option:
1. Insert Record
2. Update Record
3. Exit
Choose option: 2


Choose the fields to update:
1. Name
2. Age
3. Email
4. Phone
5. Exit
Enter option number: 1

Enter new name: tista

Choose the fields to update:
1. Name
2. Age
3. Email
4. Phone
5. Move forward to choosing condition
6. Exit
Enter option number: 5


Choose option:
1. With a condition
2. Without a condition
Enter option: 1


Choose column to add logic
1. ID
2. Name
3. Age
4. Email
5. Phone
Enter option: 2

Enter the name characteristics: pro

Choose column to add logic
1. ID
2. Name
3. Age
4. Email
5. Phone
6. Exit
Enter option: 5

Choose connector:
1. AND
2. OR
Enter option: 2
Enter the phone characteristics: 4536271890

Choose column to add logic
1. ID
2. Name
3. Age
4. Email
5. Phone
6. Exit
Enter option: 6

Back To Main Menu
The number of records updated are : 2
The query is: UPDATE Student SET name = 'prajeet' WHERE name = 'pro' OR phone = '4536271890';

Choose option:
1. Insert Record
2. Update Record
3. Exit
Choose option: 3

GoodByee!!
PS C:\Users\RICK\Documents\AntWalk\Assignment5>
```
### Database State

*After insertion*

![After insetion](https://user-images.githubusercontent.com/58776463/216805243-ac0fea94-7c01-4a06-8345-614d37b3607f.jpg)

*After updation*

![After updation](https://user-images.githubusercontent.com/58776463/216805265-1d75da4c-b4e7-47e4-b1f5-be3642425ae8.jpg)

------------------------------------------------------------------------------------------------------------------------------------------------------------------

## Objective 2

Create a **Professor** table with M:1 relationship with **Subject** table. Create a **Course** table with 1:M relationship with **Subject** table. Populate the table also with dummy data.

## Implementation

### ER Diagram

![ERD](https://user-images.githubusercontent.com/58776463/216805990-66e89a04-c672-4319-b129-b7b0f0747a59.png)


## Execution

```
  CREATE TABLE Course(
    course_id INT PRIMARY KEY AUTO_INCREMENT,
      course_name VARCHAR(30) NOT NULL
  );

  CREATE TABLE Subject(
      subject_id INT PRIMARY KEY AUTO_INCREMENT,
      subject_name VARCHAR(30) NOT NULL,
      course_id INT REFERENCES Course(course_id)
  );

  CREATE TABLE Professor(
      professor_id INT PRIMARY KEY AUTO_INCREMENT,
      professor_name VARCHAR(30) NOT NULL,
      age INT NOT NULL,
      gender CHAR(1) CHECK(gender IN ('M','F','O')) NOT NULL,
      joining_date DATE NOT NULL,
      address VARCHAR(255) NOT NULL,
      email_id VARCHAR(255) CHECK(email_id LIKE '%___@___%'),
      subject_id INT REFERENCES Subject(subject_id)
  );
```

**Execution Status**

![image](https://user-images.githubusercontent.com/58776463/216805605-fee4ac3b-8987-4775-a365-ee1445f0ad5f.png)

```
  DESC Professor;
  DESC Subject;
  DESC Course;
```

**Professor**

![image](https://user-images.githubusercontent.com/58776463/216805646-78bf48ea-39df-4ab8-b828-1bcebb89ab8e.png)

**Subject**

![image](https://user-images.githubusercontent.com/58776463/216805654-983853c2-18ae-4ffc-95b9-e388515dac53.png)

**Course**

![image](https://user-images.githubusercontent.com/58776463/216805667-4870e08e-f018-4217-8aff-e9b8b5c757c4.png)

```
  insert into course values(1001,'Computer Science');
  insert into course values(1002,'Information Technology');
  insert into course values(1003,'Electrical');

  insert into subject values(1,'Maths',1001);
  insert into subject values(2,'Soft Computing',1001);
  insert into subject values(3,'Cloud Computing',1002);
  insert into subject values(4,'Electronics',1003);

  insert into professor values(100,'Rick',22,'M','12-01-20','123,Jayant Road','prajeet@gmail.com',1001);
  insert into professor values(101,'Raj',30,'M','01-01-19','42,Vasant Villa Road','raj42@gmail.com',1002);
  insert into professor values(102,'Titas',23,'F','12-01-20','12,Bondi Nagar','titas58@gmail.com',1003);
```

**Execution Status**

![image](https://user-images.githubusercontent.com/58776463/216805733-32c25fe5-645d-4cb7-9a8b-a33cf8cda555.png)

```
  SELECT * FROM Professor;
  SELECT * FROM Subject;
  SELECT * FROM Course;
```

**Professor Table**

![image](https://user-images.githubusercontent.com/58776463/216805772-6fb53702-05ae-4052-945f-c15cdac1bae3.png)

**Subject Table**

![image](https://user-images.githubusercontent.com/58776463/216805781-c84c47cf-c9e9-4387-94c3-125e201612db.png)

**Course Table**

![image](https://user-images.githubusercontent.com/58776463/216805796-ebc28a08-7e8c-42a5-93cb-40b5c50ea1da.png)
