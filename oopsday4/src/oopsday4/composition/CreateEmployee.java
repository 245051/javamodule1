package oopsday4.composition;

public class CreateEmployee {
	public static void main(String[] args) {
		Address resadd= new Address("31","Mannath","Worli","Mumbai",400048);
		Address commadd = new Address("32","Antela","Bandra","Mumbai",400049);
		
		Employee emp1 = new Employee("John dae","MAle",20,101,"Resaecrh",4000,resadd,commadd);
		System.out.println(emp1);
		Employee emp2 = new Employee("Emmanuel","Male",22,102,"Analytics",20000, commadd, resadd);
		System.out.println(emp2);
		Employee emp3 = new Employee("Rahul","Male",23,104,"Business",40000, commadd, resadd);
		System.out.println(emp3);
		Employee emp4 = new Employee("KAldana", "Male", 24, 105, "Developer", 50000, commadd, resadd);
		System.out.println(emp4);
		Employee emp5 = new Employee("Aneeta", "Female", 23, 101, "Research", 450000, commadd, resadd);
		System.out.println(emp5);
		
		if(emp1.equals(emp5))
		{
			System.out.println("Onbjects are equal");
		}
		else
		{
			System.out.println("The objects are not equal");
		}
	}
}
