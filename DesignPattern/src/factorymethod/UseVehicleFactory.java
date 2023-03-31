package factorymethod;

public class UseVehicleFactory {
	public static void main(String[] args) {
		Vehicle creta = VehicleFactory.newInstance("Creta");
		creta.start();
		Vehicle seltos = VehicleFactory.newInstance("Seltos");
		creta.start();
		Vehicle suzuki = VehicleFactory.newInstance("Xcross"); // We are using abstraction because don't need the user to see the Seltos class.
		creta.start();
		
	}

}
