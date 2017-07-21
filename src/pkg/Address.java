package pkg;

public class Address {
	protected int StreetNumber;
	protected String StreetName;
	protected String StreetCity;
	
	public Address(int StreetNumber, String StreetName, String StreetCity)
	{
		this.StreetNumber = StreetNumber;
		this.StreetName = StreetName;
		this.StreetCity = StreetCity;
	}
	
	public String addresstoString()
	{
		
		return this.StreetNumber +" "+ this.StreetName +", "+ this.StreetCity;
	}
	
	protected int getStreetNumber() {
		return StreetNumber;
	}
	protected void setStreetNumber(int streetNumber) {
		StreetNumber = streetNumber;
	}
	protected String getStreetName() {
		return StreetName;
	}
	protected void setStreetName(String streetName) {
		StreetName = streetName;
	}
	protected String getStreetCity() {
		return StreetCity;
	}
	protected void setStreetCity(String streetCity) {
		StreetCity = streetCity;
	}

}
