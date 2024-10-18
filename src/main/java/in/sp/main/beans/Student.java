package in.sp.main.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//added
@Component
public class Student {

	@Value("Asma")
	private String name;

	@Value("101")
	private int rollno;

	@Autowired
	private Address address;  // Autowiring Address class

	// Getters and setters
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

	// Display method
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Rollno : " + rollno);
		System.out.println("Address : " + address);
	}
}
