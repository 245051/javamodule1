package functionalinterface;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		String str=null;
		String str2 ="hello";
		//Optional<String> optional =Optional.of(str);
		//System.out.println(optional.get());
		Optional<String> optional2 =Optional.ofNullable(str);
		if(optional2.isPresent())
			System.out.println("Value is present"+optional2.get());
		else
			System.out.println("is null"+optional2.get());
		//Str2 is passed if condition executes.

	}

}
