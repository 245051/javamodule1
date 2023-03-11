package TestLambda;
//Functional interface is the interface with one abstract method.
//Interface with 1 method is called functional interface .

@FunctionalInterface
interface Shape{
	double area();
}
interface Math{
	 double power(int b,int e);
		// TODO Auto-generated method stub
		
	}
interface factorial{
	double fact(int n);
}

	

public class Example1 {
	public static void main(String[] args) {
		int a = 10;
		Shape s= ()->{
						return 0.0;
		              };
		double result = s.area();
		System.out.println(result);
		//If we need to use Math then it should be a functional inetrface.
		Math s2 = (b,e)->{  
						int p =1;
					for(int i=0;i<=e;i++) {
							p *=b; 
					}
						return p;
						};
	
	double result1 = s2.power(2, 3);
	System.out.println(result1);
	
	Runnable r1 = new Runnable() {
		public void run() {
			System.out.println("From run method");
		}
	};
	Thread t1 = new Thread(r1);
	t1.start();
	Runnable r =()->{
	
		for(int i=0;i<5;i++)
		{
			System.out.println("in run method"+i);
	     }
	
	};
	Thread t =new Thread(r);
	t.start();
	
	factorial s3 =(n)->{
		int p=1;
		while(n>0)
		{
			p = p*n;
			n--;
			
		}
		return p;
	};
	
	double result4 = s3.fact(5);
	System.out.println("The factorial is :"+result4+a);

}
}
