package bean;

public class Address {
	private String city;
	private int houseno;
	private int pincode;

//	public Address(int houseno,String city, int pincode) {
//		this.houseno=houseno;
//		this.city=city;
//		this.pincode=pincode;
//	}
	
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "#"+houseno+","+city+","+pincode;
	}
//	public void disp(){
//		System.out.print("city:"+city);
//		System.out.print("house no:"+houseno);
//		System.out.print("pin code:"+pincode);
//
//		
//	}
//	

}
