package in.sp.main.beans;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	@Value("Asma")
	private String name;
	
	@Value("101")
	private int rollno;
	
	@Autowired
=======
public class Student
{
	private String name;
	private int rollno;
>>>>>>> b0ad5638330469f9f6d2438ec7da2d0cbc113ed7
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Rollno : "+rollno);
		System.out.println("Address : "+address);
	}
}