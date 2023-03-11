package oopsday1n.withbusinessmethods;
// we create s/w
public class Carfactory {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jac= new Car("wag",100,"sudd","bb");
		jac.start();
		jac.changeGear(1);
		jac.stop();
		System.out.println(jac.getColor());
		/*
		 * jac.setBrand("Wag"); jac.setColor("Black"); jac.setModel("suv");
		 * jac.setPrice(1000000);
		 */
		/*
		 * jac.color="White"; jac.price = 2500000; jac.model = "SUV"; jac.brand = "KIA";
		 * 
		 * System.out.println(jac.color); System.out.println(jac.brand);
		 * System.out.println(jac.price); System.out.println(jac.model);
		 */
		/*
		 * System.out.println(jac); System.out.println(jac.hashCode());
		 * System.out.println(Integer.toHexString(jac.hashCode()));
		 */
		/*System.out.println(jac.getBrand());
		System.out.println(jac.getColor());
		System.out.println(jac.getModel());
		System.out.println(jac.getPrice());*/
		Car bmw = new Car("W2",230,"w233d","black");
		bmw.start();
		bmw.changeGear(9);
		bmw.stop();
		
		
		/*
		 * bmw.setBrand("W1"); bmw.setColor("white"); bmw.setModel("w223");
		 * bmw.setPrice(1000000); System.out.println(bmw);
		 * System.out.println(bmw.hashCode());
		 * System.out.println(Integer.toHexString(bmw.hashCode()));
		 */
		/*System.out.println(bmw.getBrand());
		System.out.println(bmw.getColor());
		System.out.println(bmw.getModel());
		System.out.println(bmw.getPrice());
		*/
		/*
		 * bmw.color = "White"; bmw.price = 100000; bmw.model = "ordinary"; bmw.brand
		 * ="W1";
		 */
		
		/*
		 * System.out.println(bmw.color); System.out.println(bmw.price);
		 * System.out.println(bmw.brand); System.out.println(bmw.model);
		 */
	}

}
