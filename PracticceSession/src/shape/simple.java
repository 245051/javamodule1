package shape;

public class simple {
	public static int sum(int a,int b) {
		int s =a+b;
		return s;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b =0;
		int res=0;
////		int sm =0;
//		sm = sum(a,b);
//		System.out.println(sm);
		try {
			res= a/b;
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}

}
