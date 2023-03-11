package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
List<String> strings = Arrays.asList("AndraPradesh","TamilNadu","Telangana","kerala","Karanataka");
		
		
		Function<String,Integer> f =(str)->{
			return(str.length());
		};
		
		Function<String,String> f2 =(str)->{
			return str.toUpperCase();
		};
		Function<String,String> f3 =(str)->{
			return str.toLowerCase();
		};
		
		Function<String,String> f4 =(str)->{
			StringBuilder c = new StringBuilder(str);
			StringBuilder rev = c.reverse();
			String rev1 = rev.toString();
			return rev1;
		};
		printLength(strings, f);	
		printUpper(strings,f2);
		printLower(strings,f3);
		printReverse(strings,f4);
		
	} 
	//We are passing the string and lambda function as an argument.
	
public static void printLength(List<String> strings,Function<String,Integer>fRef)
{
	for(String str:strings) {
		System.out.println("The length of"+str+"is" +fRef.apply(str));
	}
}

public static void printUpper(List<String> strings,Function<String,String>fref1)
{
	for(String s:strings) {
		System.out.println(fref1.apply(s));
	}
}

public static void printLower(List<String> strings,Function<String,String>fref2)
{
	for(String s:strings) {
		System.out.println(fref2.apply(s));
	}
	
}
public static void printReverse(List<String> strings,Function<String,String>fref3)
{
	for(String s:strings) {
		System.out.println(fref3.apply(s));
	}
}


}







