package shape;

import java.util.Iterator;
import java.util.TreeSet;

public class kjhhku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> map =new TreeSet();
map.add("one");
map.add("two");
map.add("three");
map.add("four");
map.add("one");
Iterator it =map.iterator();
while(it.hasNext())
{
	System.out.println(it.next()+" ");
}
	}

}
