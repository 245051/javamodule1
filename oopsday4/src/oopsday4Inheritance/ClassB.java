package oopsday4Inheritance;

public class ClassB extends ClassA {
	
	public ClassB()
	{	super(10,20); // It will call the parameterised constructor.
		//super() It will call default parameter.Constructor must be first uncommentedbline.
		System.out.println(x+y);
		
	}
}
