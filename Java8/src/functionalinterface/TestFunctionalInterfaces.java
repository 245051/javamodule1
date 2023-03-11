package functionalinterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class TestFunctionalInterfaces {
	
	public static void main(String[] args) {
	
		//Function doesnot know the application of this function.
		//Where ever we call it will apply this method.
		//This functional interface is acting as a surrogate to the piece of code.
		List<String> strings = Arrays.asList("AndraPradesh","TamilNadu","Telangana","kerala","Karanataka");
		
		
		Function<String,Integer> f =(str)->{
			return(str.length());
		};
		System.out.println(f.apply("buneos8 dias"));
		for(String str :strings) {
			System.out.println(f.apply(str));
		}
		Function<Integer,Integer> f2 =(n)->{
									return n*n;
		};
		System.out.println(f2.apply(25));
		
		//first one is the input type second type is output type.
		Function<String,String> f3 = (str)->{
				return str.toUpperCase();
			
		};
		System.out.println(f3.apply("UST is super"));
	
		
		}
	
	
}
	
