package pkg;

public class House {
	
	protected String kind;
	protected int numOfRooms;
	protected int askingPrice;
	protected Address address;
	public int count = 0;
	public House(String kind, int numOfRooms, int askingPrice, Address address)
	{
		this.kind = kind;
		this.numOfRooms = numOfRooms;
		this.askingPrice = askingPrice;
		this.address = address;
		count++;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumOfRooms() {
		return numOfRooms;
	}
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	public int getAskingPrice() {
		return askingPrice;
	}
	public void setAskingPrice(int askingPrice) {
		this.askingPrice = askingPrice;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String HousetoString()
	{
		return this.kind+", "+this.numOfRooms + " rooms, $"+this.askingPrice+", "+this.address.addresstoString();
	}
	
	
	

}
