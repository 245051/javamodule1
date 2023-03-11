package StateMachine;
import java.util.Scanner;
public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int f=0; Scanner sc = new Scanner(System.in); while(f<3) {
		 * System.out.println("Enter the amount:"); double amount = sc.nextDouble();
		 * //object of the function for denomination printing. // object of the function
		 * for calling Amount statement }
		 */
		IFunction f = new IFunction();
		f.Amount();
	}

}
