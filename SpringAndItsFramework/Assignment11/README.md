# Assignment 11

## Objective
Add one more table and its definition(Dao,DaoImpl,RowMapper, bean Configuration)
in the same example( create a copy and then add)

## Already Present
- A dao, dao-implementation, mapper and object for employee

## Added
- A dao, dao-implementation, mapper and object for student

## Database Configurations
- A MySQL database with name springjdbc
Run the below script
```
create table student(
	stid int primary key auto_increment,
	name varchar(50),
	age int
);
```

## Output
```
PS C:\Users\PRAJEETG\Desktop\Assignment-11-main\JDBCSpringAssign>  & 'C:\Program Files\Java\jdk-17\bin\java.exe' '@C:\Users\PRAJEETG\AppData\Local\Temp\cp_7lg5us2h5pra9lg17ds1eas1g.argfile' 'org.antwalk.Student.Test' 
Adding records
Enter number of data you want to enter:2
Enter name of the student: Prajeet
Enter age of the student: 22
Created Record Name = Prajeet Age = 22
Enter name of the student: Jingshu
Enter age of the student: 25
Created Record Name = Jingshu Age = 25
Listing the Student
id 1
Name Prajeet
age 22
id 2
Name Jingshu
age 25
PS C:\Users\PRAJEETG\Desktop\Assignment-11-main\JDBCSpringAssign> 
```
