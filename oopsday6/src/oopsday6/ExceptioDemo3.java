package oopsday6;

public class ExceptioDemo3 {
	public static void main(String[] args) throws ArithmeticException {
		System.out.println("Program task begin");
		try {
			System.out.println("Entered  try----");
			int c = 10/0;
			System.out.println("from try after exception----");
		}catch(Exception e) {
			System.out.println("from catch -----");
		}
		finally {
			System.out.println("finally");
		}
		
		System.out.println("Program completd");
		
	}

}
