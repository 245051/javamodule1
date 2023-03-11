package oopsday3;

public class Compare {
	public static void main(String[] args) {
		Rectangle r1 =new Rectangle();
		Rectangle r2 = new Rectangle();
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		// Comparing primitives.
		int a =10;
		int b = 35;
		boolean result  = a==b; //are they same .
		
		//Comparing objects.:case1: comparing refrences 
		//case2. comparing numbers.
		
		result = r1 == r2;
		System.out.println(result);
		
		result = t1==t2; 
		System.out.println(result);
		
		//result = r1 ==t1;// incompatable type .nothing common classes cannot be compared.
		System.out.println(result);
		
		Rectangle r3 =r1; // r3 act as a pointer which is reference to the object r1 . 
		result = r3 ==r1;
		
		System.out.println(result);
		System.out.println(r1.hashCode());
		System.out.println(r3.hashCode());
		
		result =r1.equals(r2);
		System.out.println(result);
		
		System.out.println(r2.hashCode());
		
		result = r1.equals(r3); //equals methods is applicable for primitives.
		System.out.println(result);
		
		r1.setLength(355);
		r1.setBreadth(23);
		
		r2.setBreadth(23);
		r2.setLength(355);
		
		if(r1.getLength() == r2.getLength() && r1.getBreadth()== r2.getBreadth())
		{
			System.out.println("They  are equal:");
		}
		else
		{
			System.out.println("They are not equal:");
		}
	
		t1.setS1(355);
		t1.setS2(43);
		t1.setS3(45.5);
	
		
		// We are not comparing object r1 and t1 else we are comparing data members of two objects.
		if(r1.getLength() == t1.getS1()) {
			System.out.println("The length and s1 are same.");
		}
		else
		{
			System.out.println("The length and s1 are not same.");
		}
	
	
	}
}
