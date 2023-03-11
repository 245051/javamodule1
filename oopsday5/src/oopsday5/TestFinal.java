package oopsday5;

public class TestFinal {
	
	//int  a=b;	//Trying to access a variable which is not defined is called forward reference.
	// Study when memory happens for static and non sattic
	int a=b; // b is forward reference. 	
	static int b=10; 
	static  final double pie =3.14; // final means compile time constants. It will save memory and increase the compile time of program.To a global modifier we can add protect,public,private ,satic ect.
	
	public static void main(String[] args)
	{
		int s=10;
		Integer str = Integer.valueOf(s);
		
	}
	}


