package oopsday4.polymorphism;

public class Square extends Shape {
	private int s;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public Square(int s) {
		super();
		this.s = s;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public double area() {
		return this.s*this.s;
	}
	
}
