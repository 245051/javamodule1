package listdemo;
import java.util.Iterator;
import java.util.ArrayList;
public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList flowers = new ArrayList();
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double(7.88));
		flowers.add("Tulip");
		flowers.add("Rose");
		flowers.add("Jasmin");
		flowers.add("Lilly");
		
		System.out.println(flowers);
		System.out.println(flowers.size());
		System.out.println(flowers.get(3));
		System.out.println(flowers.contains("lilly"));//Elements are case sensitive.
		flowers.add(2,"Sunflowers");
		System.out.println(flowers);
		flowers.remove(2);
		
		for(Object obj :flowers) {
			System.out.println(obj);
		}
		System.out.println("-------------------------------");
		Iterator iter = flowers.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("------------------------------");
		for(int i=0;i<flowers.size();i++)
		{
			System.out.println(flowers.get(i));
		}
		System.out.println("-------------------------------");
	
		System.out.println("hello".length());
		String str = (String)flowers.get(3);
		
		Object obj = flowers.get(2);
		if(obj instanceof Integer)
		{
			Integer in = (Integer)obj;
			System.out.println(in.MIN_VALUE);
			
		}
		else if(obj instanceof String)
		{
			String str1 =(String)obj;
			System.out.println(str1.toUpperCase());
		}
		}
		
		
}
	


