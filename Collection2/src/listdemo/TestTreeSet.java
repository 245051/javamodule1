package listdemo;
import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> bookSet = new TreeSet<>();
		bookSet.add("Java in nutshell");
		bookSet.add("Java Complete reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for dummy");
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java in nutshell"));
		
		bookSet.add("Thinking in Java");
		System.out.println(bookSet.size());
		
		for(String book:bookSet) {
			System.out.println(book);
		}
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		bookSet.add(null);//Tree set doesnot allow null values.
		System.out.println(bookSet);
	
	}

}
