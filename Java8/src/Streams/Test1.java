package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Consumer;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList();
			list.add("sun");
			list.add("moon");
			list.add("jupiter");
			list.add("uranus");
			list.add("pluto");
			list.add("mars");
			list.add("venus");
			//stream:Every object in an array is passed implicitly.
			/*
			 * int count = (int) list.stream().filter((str)->str.length()>10).count();
			 * System.out.println(count);
			 */
			Predicate<String> p =(str)->{
				return(str.length()>3||str.length()<10);
			};
			Function<String,String> f=(str)->{
				return str.toUpperCase();
				
			};
			
			long count = list.stream().filter(p).count(); // Stream will have filter map and a terminal operation to a stream.
			System.out.println(count);
			List<String> outlist= list.stream().map((str)->str.toUpperCase()).collect(Collectors.toList());
			System.out.println(outlist);
			Consumer<String> c = (str)->{
				System.out.println(str);
			};
			
			
			list.stream().forEach(System.out::println);
			
			list.stream().filter(p).map(f).forEach(c);	
	
	}
//filter,transform then print
}
