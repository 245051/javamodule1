package factorymethod;

public class VehicleFactory {
	public static Vehicle newInstance(String car) { // We are using the abstaratlion using the vehicle interface .So that we can use the function inside it when ever it sis reqd.
		Vehicle vehicle=null;
		if(car == null) {
			return null;
		}
		else if(car.equals("Creta"))
			vehicle = new Creta();
		else if(car.equals("Seltos"))
		{
			vehicle=new Seltos();
			
		}
		else if(car.equals("XCross"))
			vehicle=new XCross();
		return vehicle;
	}

}
