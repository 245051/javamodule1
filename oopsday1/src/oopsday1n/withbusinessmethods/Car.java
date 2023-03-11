package oopsday1n.withbusinessmethods;
//WE create real world object
public class Car {
	private String color;
	private double price;
	/**
	 * 
	 */
	private String brand;
	private String model;
	public Car(String color, double price, String brand, String model) {
		super();
		this.color = color;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	
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
		/*
		 * //return "Car [color=" + color + ", price=" + price + ", brand=" + brand +
		 * ", model=" + model + ", getColor()=" + getColor() + ", getPrice()=" +
		 * getPrice() + ", getBrand()=" + getBrand() + ", getModel()=" + getModel() +
		 * ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
		 * + super.toString() + "]";
		 */
	}
	
	public void start() {
		System.out.println("Car is starting....");
		
	}
	public void changeGear(int gear) {
		System.out.println("car is in"+gear);
	
	}
	public void stop() {
		System.out.println("CAr is stopping");
	}

}
