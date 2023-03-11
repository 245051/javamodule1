package listdemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class TestLinkList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("marker");
		list.add("Pencil");
		list.add("book");
		list.add("Eraser");
		list.add("Sharpener");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());//Gives the head of the linked list.
		System.out.println(list.getLast()); //Gives the tale of the linked list.
		System.out.println(list.get(2));
		list.add(2, "Sticky notes");
		System.out.println(list);
		
		Iterator<String> iter = list.descendingIterator(); //Gives the index or array.
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		ListIterator<String> listIter = list.listIterator();
		while(listIter.hasNext())
		{	
			String element = listIter.next();
			if(element.equals("pencils"))
			System.out.println(listIter.next());
		}
		
		
		
		
		
	}
	

}
