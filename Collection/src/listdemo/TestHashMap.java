package listdemo;
import java.util.Iterator;
import java.util.Set;
import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;

public class TestHashMap {
	
	public static void main(String[] args) {
		HashMap<String,String> countryCurr = new HashMap();
		countryCurr.put("100","Rupee");
		countryCurr.put("USA", "Dollar");
		countryCurr.put("Pound", "UK");
		System.out.println(countryCurr);
		System.out.println(countryCurr.get("100"));
		countryCurr.put("IND", "Rupee");
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsValue("Dollar"));
		System.out.println(countryCurr.containsKey("UK"));
		countryCurr.put(null, null);
		System.out.println(countryCurr);
		//Hash map has b3 views.
		//1.Key View
		Set<String> keys =countryCurr.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		//2.Values view
		Collection<String> values = countryCurr.values();
		for(String value:values)
		{
			System.out.println(value);
		}
		//3.Key Values together - Entry Set
		Set<java.util.Map.Entry<String,String>> entries = countryCurr.entrySet();
		for(java.util.Map.Entry<String, String> entry:entries){
			System.out.println(entry);
		}
		{
			
		}
				
	}

}
