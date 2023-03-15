package oopsday4.composition;

public class ClassA {
	
	protected int x; // private to parent class will be private to sub class.
	protected int y;
	ClassA(){
		System.out.println("FromClassA");
	}
	public ClassA(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
