package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Student;

@SpringBootApplication
public class BasicBeanDemo1Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BasicBeanDemo1Application.class, args);

		// Choose the correct bean name
		Student std1 = (Student) context.getBean("student");  // Use "student" or "stdObj" as appropriate
		// Student std1 = (Student) context.getBean("stdObj"); // Uncomment this line if you want to use "stdObj"

		std1.display();
	}
}
