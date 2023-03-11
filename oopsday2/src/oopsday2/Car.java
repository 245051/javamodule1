package oopsday2;

public class Car implements CarIface {
	private double fuel;
	private double battery;
	private double kilometersRun;
	private boolean enginestatus ;
	
	
	public Car() {
	// TODO Auto-generated constructor stub
}
	@Override
	public void start() {
		if(enginestatus ==true &&fuel>1000&&battery >100)
			System.out.println("Engine Starting");
			enginestatus = true;
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		if(enginestatus) {
			for(int i=0;i<50;i++) {
				System.out.println("CAr is moved");
				fuel = fuel-10;
				battery = battery-2;
				kilometersRun++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		}

	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", kilometersRun=" + kilometersRun + ", enginestatus="
				+ enginestatus + "]";
	}
	public Car(double fuel, double battery, double kilometersRun, boolean enginestatus) {
		super();
		this.fuel = fuel;
		this.battery = battery;
		this.kilometersRun = kilometersRun;
		this.enginestatus = enginestatus;
	}
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	public double getBattery() {
		return battery;
	}
	public void setBattery(double battery) {
		this.battery = battery;
	}
	public double getKilometersRun() {
		return kilometersRun;
	}
	public void setKilometersRun(double kilometersRun) {
		this.kilometersRun = kilometersRun;
	}
	public boolean isEnginestatus() {
		return enginestatus;
	}
	public void setEnginestatus(boolean enginestatus) {
		this.enginestatus = enginestatus;
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("CAr is stopping");
		enginestatus =false;
	}

}
