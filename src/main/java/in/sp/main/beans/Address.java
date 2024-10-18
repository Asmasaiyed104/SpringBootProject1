package in.sp.main.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("222")
	private int houseno;

	@Value("Banglore")
	private String city;

	@Value("123321")
	private String pincode;  // Changed pincode type to String to resolve conflict

	// Getters and setters
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	// toString method to display address details
	@Override
	public String toString() {
		return "#" + houseno + ", " + city + " - " + pincode;
	}
}
