package factorymethod;

public class Seltos implements Vehicle {
	@Override
	public void start()
	{
		System.out.println("started ......."+getClass());
		
	}

	@Override
	public void stop() {
		System.out.println("stopped........"+getClass());
		
	}

	@Override
	public void honk() {
		System.out.println("PAlm PAlm ...."+getClass());
		
	}

	@Override
	public void move() {
		System.out.println("Its moving....."+getClass());
		
	}

}
