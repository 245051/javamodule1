package UserDefinedObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestHashMap {
	public static void main(String[] args) {
		Employee emp1 = new Employee("John dae","MAle",20,101,"Resaecrh",4000);
		
		Employee emp2 = new Employee("Emmanuel","Male",22,102,"Analytics",20000);
		
		Employee emp3 = new Employee("Rahul","Male",23,104,"Business",40000);
		
		Employee emp4 = new Employee("KAldana", "Male", 24, 105, "Developer", 50000);
		
		Employee emp5 = new Employee("Aneeta", "Female", 23, 101, "Research", 450000);
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		HashSet<Employee> empset = new HashSet<>();
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		empset.add(emp5);
		
		TreeSet<Employee> emptreeset = new TreeSet<Employee>();
		emptreeset.add(emp1);
		emptreeset.add(emp2);
		emptreeset.add(emp3);
		emptreeset.add(emp4);
		emptreeset.add(emp5); 
		
		HashMap<String,Collection<Employee>> dataMap = new HashMap<>();
		dataMap.put("empList", empList); //string and collectionlist
		dataMap.put("empset",empset);
		dataMap.put("emptreeset",emptreeset);
		
		System.out.println(dataMap);
		
		Collection<Employee> list = dataMap.get("empList");
		Iterator<Employee> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Collection<Employee> set = dataMap.get("empset");
		iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection<Employee> tree = dataMap.get("emptreeset");
		iter = tree.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
		
		
		
	}
	
}
