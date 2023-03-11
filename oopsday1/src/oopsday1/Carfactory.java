package oopsday1;
// we create s/w
public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jac= new Car();
		jac.color="White";
		jac.price = 2500000;
		jac.model = "SUV";
		jac.brand = "KIA";
		
		System.out.println(jac.color);
		System.out.println(jac.brand);
		System.out.println(jac.price);
		System.out.println(jac.model);
		
		Car bmw = new Car();
		bmw.color = "White";
		bmw.price = 100000;
		bmw.model = "ordinary";
		bmw.brand ="W1";
		
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
	}

}
