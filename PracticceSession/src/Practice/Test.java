package Practice;

public class Test {
	static void add(int a)
	{
		System.out.println(a);
	}
	
	static int add(int a,int b)
	{
		int sum =a+b;
		return sum;
	}

	static int add(int a,float b)
	{
		int sum =(int)(a+b);
		return sum;
	}
	public static void main(String[] args) {

		Parent c = new Child();
		c.display();
		Parent c1 = new Parent();
		c1.display();
		Test.add(67);
		int s = Test.add(78,22);
		System.out.println(s);
	}

}
