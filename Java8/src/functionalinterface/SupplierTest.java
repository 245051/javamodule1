package functionalinterface;
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;

public class SupplierTest {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("AndraPradesh","TamilNadu","Telangana","kerala","Karanataka");
	
	Supplier<String> supplier = ()->{
											return new String("Hola!");
										};

    System.out.println(supplier.get());

	}
	public static void fetchStrings(List<String> strings,Supplier<String>sfr)
	{
		for(String str:strings) {
			sfr.get();
		}
	}
	
	
	
	}
