package oopsday1.setget;
// we create s/w
public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jac= new Car();
		jac.setBrand("Wag");
		jac.setColor("Black");
		jac.setModel("suv");
		jac.setPrice(1000000);
		
		System.out.println(jac.getBrand());
		System.out.println(jac.getColor());
		System.out.println(jac.getModel());
		System.out.println(jac.getPrice());
		Car bmw = new Car();
		
		bmw.setBrand("W1");
		bmw.setColor("white");
		bmw.setModel("w223");
		bmw.setPrice(1000000);
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getColor());
		System.out.println(bmw.getModel());
		System.out.println(bmw.getPrice());
		
		
	}

}
