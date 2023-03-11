package listdemo;
import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque { //We use poll and peak function
	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.addLast("First");
		queue.addLast("Second");
		queue.addLast("Third");
		queue.addLast("Fourth");
		queue.addLast("Fifth");
		System.out.println(queue);
		System.out.println(queue.size());
		
		String element  = queue.getFirst();
		System.out.println(element);
		queue.poll();
		String element1 = queue.peek();
		System.out.println(queue);
		System.out.println(queue.poll());
		
		Iterator<String> iter = queue.iterator();
		while(iter.hasNext())
		{System.out.print(iter.next()+" ");
			
		}
	
	}

}
