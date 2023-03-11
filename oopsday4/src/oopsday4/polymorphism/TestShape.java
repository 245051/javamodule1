package oopsday4.polymorphism;

public abstract class TestShape extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s =new Square(7);
		System.out.println(s.area());
		Shape c = new Circle(7);
		System.out.println(c.area());
		Shape r = new Rectangle(8,7);
		System.out.println(r.area());
	}

}
