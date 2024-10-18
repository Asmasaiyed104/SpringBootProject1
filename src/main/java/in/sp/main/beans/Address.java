package in.sp.main.beans;

public class Address 
{
	private int houseno;
	private String city;
	private String pincode;
	
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
	
	@Override
	public String toString()
	{
		return "#"+houseno+", "+city+" - "+pincode;
	}
}
