package shape;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuffer x = new StringBuffer();
		{
			x.append(S);
		
		System.out.println(x);
		x.reverse();
		
		String y = x.toString();
		System.out.println(y);
		}
		
				

	}

}
