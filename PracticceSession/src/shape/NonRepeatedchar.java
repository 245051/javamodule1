package shape;
import java.util.*;
public class NonRepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String x =s;
		for(int i=0;i<s.length();i++)
		{
			char y = s.charAt(i);
		for(int j=i+1;j<s.length();j++)
		{	
				char z = s.charAt(j);
				if(z==y)
				{	
					break;
				}
				else
				{
					System.out.println(y);
				}
			}
			
		}
		
		
	}

}
