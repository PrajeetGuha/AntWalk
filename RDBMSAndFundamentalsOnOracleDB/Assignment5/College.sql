-- CREATION OF TABLE

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

-- DESCRIPTION OF TABLE
DESC Professor;
DESC Subject;
DESC Course;

-- INSERT DATA

insert into course values(1001,'Computer Science');
insert into course values(1002,'Information Technology');
insert into course values(1003,'Electrical');

insert into subject values(1,'Maths',1001);
insert into subject values(2,'Soft Computing',1001);
insert into subject values(3,'Cloud Computing',1002);
insert into subject values(4,'Electronics',1003);

insert into professor values(100,'Rick',22,'M','12-01-20','123,Jayant Road','prajeet@gmail.com',1001);
insert into professor values(101,'Raj',30,'M','42,Vasant Villa Road','raj42@gmail.com',1002);
insert into professor values(102,'Titas',23,'F','12,Bondi Nagar','titas58@gmail.com',1003);

-- SEE THE TABLE DATA
SELECT * FROM Professor;
SELECT * FROM Subject;
SELECT * FROM Course;