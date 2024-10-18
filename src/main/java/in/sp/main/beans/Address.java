package in.sp.main.beans;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
	@Value("222")
	private int houseno;
	
	@Value("Banglore")
	private String city;
	
	@Value("123321")
	private int pincode;
=======
public class Address 
{
	private int houseno;
	private String city;
	private String pincode;
>>>>>>> b0ad5638330469f9f6d2438ec7da2d0cbc113ed7
	
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
<<<<<<< HEAD
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
=======
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
>>>>>>> b0ad5638330469f9f6d2438ec7da2d0cbc113ed7
		this.pincode = pincode;
	}
	
	@Override
	public String toString()
	{
		return "#"+houseno+", "+city+" - "+pincode;
	}
}
