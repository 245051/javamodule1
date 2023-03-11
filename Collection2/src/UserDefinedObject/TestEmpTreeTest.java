package UserDefinedObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmpTreeTest {
	
	public static void main(String[] args) {
		TreeSet<Employee> emptreeset = new TreeSet<Employee>(); //class name is an object type. Employee is the type information then it will accept only object of Employye or type of Employee
		Employee emp1 = new Employee("John dae","MAle",20,101,"Resaecrh",4000);
		
		Employee emp2 = new Employee("Emmanuel","Male",22,102,"Analytics",20000);
		
		Employee emp3 = new Employee("Rahul","Male",23,104,"Business",40000);
		
		Employee emp4 = new Employee("KAldana", "Male", 24, 105, "Developer", 50000);
		
		Employee emp5 = new Employee("John dae", "Female", 20, 101, "Research", 4000);
		emptreeset.add(emp1);
		emptreeset.add(emp2);
		emptreeset.add(emp3);
		emptreeset.add(emp4);
		emptreeset.add(emp5); //
		System.out.println(emptreeset);
		System.out.println(emptreeset.size()); // HAsh Set does not allow duplicates
	}
	

}
