package org.antwalk.Student;

import java.util.*;

//import org.antwalk.dao.BookDaoImpl;
//import org.antwalk.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Scanner sc = new Scanner(System.in);
		StudentDao std = (StudentDao) context.getBean("StudentDaoImpl");
		System.out.println("Adding records");
		System.out.print("Enter number of data you want to enter:");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++){
			System.out.print("Enter name of the student: ");
			String name = sc.nextLine();
			System.out.print("Enter age of the student: ");
			int age = sc.nextInt();
			sc.nextLine();
			std.create(name, age);
		}
		
		System.out.println("Listing the Student");

		
		List<Student> student =std.listStudents();
		try {
			for (Student st1 : student) {
				System.out.println("id " + st1.getStid()); //
				System.out.println("Name " + st1.getName()); //
				System.out.println("age " + st1.getAge()); // } //
			}	
		}
		catch(Exception e)
		{
			System.out.println("Null error");
		}
       
	}

}
