package oopsday1n.setgetconstructor;
//WE create real world object
public class Car {
	private String color;
	private double price;
	/**
	 * 
	 */
	private String brand;
	public Car(String color, double price, String brand, String model) {
		super();
		this.color = color;
		this.price = price;
		this.brand = brand;     //,ki,,
		this.model = model;
	}public Car() {
		// TODO Auto-generated constructor stub
	}
	private String model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "I am "+brand;
		
	}
	
	
	

}
