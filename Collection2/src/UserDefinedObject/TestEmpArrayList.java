package UserDefinedObject;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmpArrayList {
	
	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>(); //class name is an object type. Employee is the type information then it will accept only object of Employye or type of Employee
		Employee emp1 = new Employee("John dae","MAle",20,101,"Resaecrh",4000);
		
		Employee emp2 = new Employee("Emmanuel","Male",22,102,"Analytics",20000);
		
		Employee emp3 = new Employee("Rahul","Male",23,104,"Business",40000);
		
		Employee emp4 = new Employee("KAldana", "Male", 24, 105, "Developer", 50000);
		
		Employee emp5 = new Employee("Aneeta", "Female", 23, 101, "Research", 450000);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		System.out.println(empList);
	}
	

}
