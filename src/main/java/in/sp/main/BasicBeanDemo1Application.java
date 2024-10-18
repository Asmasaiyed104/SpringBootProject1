package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.beans.Student;

@SpringBootApplication
public class BasicBeanDemo1Application
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(BasicBeanDemo1Application.class, args);
		
<<<<<<< HEAD
		Student std1 = (Student) context.getBean("student");
=======
		Student std1 = (Student) context.getBean("stdObj");
>>>>>>> b0ad5638330469f9f6d2438ec7da2d0cbc113ed7
		std1.display();
	}
}