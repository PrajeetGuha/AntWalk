package org.nrifintech.aop;

import org.nrifintech.aop.models.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;  

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class AopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AopApplication.class, args);
		Student student = context.getBean("student",Student.class);
		student.setName("prajeet");
		student.setEngMarks(70);
		student.setHinMarks(80);
		student.setMatMarks(98);
		student.avgMarks();
		student.showMarks();
	}

}
