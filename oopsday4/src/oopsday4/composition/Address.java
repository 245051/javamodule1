package oopsday4.composition;

public class Address {

	private String doorNo;
	private String buildingName;
	private String street;
	private String city;
	private int pin;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String doorNo, String buildingName, String street, String city,int pin) {
		super();
		this.doorNo = doorNo;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pin =pin ;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
}
