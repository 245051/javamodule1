package shape;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collection;
public class Substring2 {
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		TreeSet<String> st = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int g = s.length();
		for(int i=0;i<g-3;i++) {
			
			st.add(s.substring(i,i+3));
		}
	
		Iterator itr= st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		int k = st.size();
		System.out.println(st.first() +" " +st.last() );
		System.out.println("------------");
		System.out.println(st.ceiling("wel"));
		System.out.println(st.floor("lco"));
	
	}
	

}
