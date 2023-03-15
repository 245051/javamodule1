package firstTest;

public class Calculator {

	public double power(int b,int e) {
		int p=1;
		int i=1;
		if(b==0||e==0)
		{
			return 0;
		}
		else
		{
			while(i<=e) {
				p*=b;
			}
		}
		return Math.pow(b, e);
	}
	
	public int fact(int a)
	{
		int f=1;
		while(a>0)
		{
			f=f*a;
			a=a-1;
			
		}
		return f;
	}
	public int sum(int a,int b)
	{
		int sum=0;
		sum=a+b;
		
		
		return sum;
	}
	
	
}
