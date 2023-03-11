package oopsday3;

public class MathC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathFun  b= new MathFun();
		b.prime(4, 10);
		System.out.println(b.addition(23, 30));
		
		if(b.armstrong(153)==1)
			System.out.println("Yes it is armstrong");
		else
			System.out.println("No it is not");
		System.out.println(b.division(6, 2));
		System.out.println(b.factorial(5));
		System.out.println(b.subtraction(45,34));
		
		

	}

}
