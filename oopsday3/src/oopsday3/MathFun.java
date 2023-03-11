package oopsday3;
import java.lang.Math;

public  class MathFun implements MathIface {
	private Member m = new Member();

	@Override
	public int factorial(double number) {
		double fact =1;
		if(number == 0)
			return 0;
		else
		{
			while(number>1)
			{
				fact = fact*number;
				number-=1;
			}
			return (int)fact;
		}
	}

	@Override
	public void prime(int number1, int number2) {
		// TODO Auto-generated method stub
		
		
		for(int i = number1;i<number2;i++) {
			for(int j=2;j<number1;j++) {
				if(i%j==0)
					break;
				else
				{
					m.setResult(i);
					System.out.println(m.getResult());
				}
			}
		}
		
	}

	@Override
	public int armstrong(double number) {
		// TODO Auto-generated method stub
		double n =number;
		double j = 3;
		double r=0;
		double sum=0;
		while(n>0)
		{
			r = n%10;
			sum = sum+Math.pow(sum, number);
			n = n/10;
		}
		if(sum == number)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public int addition(int number1, int number2) {
		// TODO Auto-generated method stub
		return number1 + number2;
	}

	@Override
	public int sumofn(int n) {
		// TODO Auto-generated method stub
		int sum =0;
		while(n>0)
		{
			sum+=n;
			n--;
			
		}
		return sum;
	}

	@Override
	public double division(double n, double n2) {
		// TODO Auto-generated method stub
		
		return n/n2;
	}
	@Override
	public int subtraction(int n1,int n2) {
		return n1-n2;
		
	}

	@Override
	public int Subtraction(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
