package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class PredicateTest {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("AndraPradesh","TamilNadu","Telangana","kerala","Karanataka");

		//Predicate :We uses it to give an true or false as output and the return statement conatins the condition. (boolean-valued function
		Predicate<String> p = (String str)->{
			return str.length()>10;
		};
		for(String sts:strings)
		System.out.println(p.test(sts));
		longString(strings,p);
	
}
	public static void longString(List<String> strings,Predicate<String>pref1)
	{
		for(String str:strings) {
			System.out.println(pref1.test(str));
		}
	}
	
}
