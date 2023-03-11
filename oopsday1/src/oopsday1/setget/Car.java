package oopsday1.setget;
//WE create real world object
public class Car {
	private String color;      //We are creating the variable as private.So we are using set and getter function.
	private double price;
	private String brand;
	private String model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;// if we donot use this it will printing a null value.
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) { //scope of variable is local to the function
		this.price = price;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;					// Set is hiding instance variable.Local variable will dominate and hide the instance variable.Their by we cannot access instance variable.
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
