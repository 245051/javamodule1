package StateMachine;

import java.util.Scanner;

public class IFunction implements StateIface {
	public IFunction() {
		Scanner sc = new Scanner(System.in);
		//Constructor
	}

	

	BankDemo mf[] = new BankDemo[2];		// For storing the denoomination,values .It will conatin the variables in
	
	// instance variable.
	mf[0] = new BankDemo(100,8);
	mf[1] = new BankDemo(200,4);
	
	double amt;

	@Override
	public double Amount() {
		/*
		 * System.out.println("Enter the note"); // To get the notes details. for (int i
		 * = 0; i < mf.length; i++) { System.out.println(1.); double s =
		 * sc.nextDouble(); mf[i].setValue(s);
		 * System.out.println("Enter the total no. of notes:"); double s2 =
		 * sc.nextDouble(); mf[i].setdCount(s2);
		 */
		
		System.out.println("Enter the amount"); // User enters the amount.
		double s3 = sc.nextInt();
		double s7 = Denomination(s3);
		if(s7==1) {
			System.out.println("Congrats:");
			//temp = mf[s4]
		}

		return 0;
	}

	@Override
	public double Denomination(double dtn) {
		System.out.println("Enetr the denomination the user requires:");
		System.out.println("1.10");
		System.out.println("2.50");
		System.out.println("3.100");
		System.out.println("4.200");
		System.out.println("5.500");
		int s4 = sc.nextInt();
		int flag = 0;
		double s6=0 ,s5=0;
		// Checking Whether the entered denomination is divisible.
		if (dtn % s4 == 0) {
			flag = 1;

		} else {
			flag = 0;
		}
		if (flag == 1) {
			s5 = dtn / s4; // Gives the number of notes that is required.
			for (int i = 0; i < mf.length; i++)
			{ // Gives the number of  notes is present in the array of object.
				if (mf[i].getValue() >= s6)
				{
					s6 = mf[i].getdCount();
					break;
				}
			}

		}
		if(s5>=s6)
		{	flag =0;
			double s8 = Balance(s4,s5); // Returns the denomination to the balance to reduce the number of notes.
			
		}
		else
		{
			flag =0;
		}
			return flag;
		
	}

	@Override
	public double Balance(double bln,double n ) {
		// TODO Auto-generated method stub
		double temp,h;
		for(int i =0;i<mf.length;i++)
		{
			if(bln == mf[i].getValue())
			{
				temp = mf[i].getdCount();
				h = temp-n;
				h =mf[i].getdCount();
			}
		
		
		return 0;
	}
}
}
