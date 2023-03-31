package Practice;

public class BabyException extends Exception{
	
	@Override
	public String getMessage() {
		System.out.println("invalid input");
		return super.getMessage();
	}

}
