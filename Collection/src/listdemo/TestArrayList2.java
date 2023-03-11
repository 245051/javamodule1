package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<>();//Defining the type of arraylist.
		//colors.add(new Object());
		//colors.add(new Double("10.10"));
		colors.add("Blue");
		colors.add("Green"); // It accepts only string.Usually array list accepts heterogenous type of data's.Inorder to specify its use we use type casting. 
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		System.out.println(colors.size());
		System.out.println(colors);
	}

}
