package UserDefinedObject;

import java.util.Objects;

public class Employee extends Person implements Comparable{
		
		private long empid;
		private String deptno;
		private double salary;
		
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Employee(String name, String gender, int age,long empid,String deptno,double salary) {
			super(name, gender, age);
			this.empid =empid;
			this.deptno =deptno;
			this.salary = salary;
		}

		public long getEmpid() {
			return empid;
		}

		public void setEmpid(long empid) {
			this.empid = empid;
		}

		public String getDeptno() {
			return deptno;
		}

		public void setDeptno(String deptno) {
			this.deptno = deptno;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() 
		{
			return "Employee [empid=" + empid + ", deptno=" + deptno + ", salary=" + salary + ", getName()=" + getName()
					+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + ", toString()=" + super.toString()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(deptno, empid, salary);
		}
		

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(deptno, other.deptno) && empid == other.empid
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}

		@Override
		public int compareTo(Object o) { // We are using the compareto method which is present in an interface so we use Implement Comparable to call the compareto function.
			Employee ref = null; // Initializing the ref where ref is an object
			if(o != null)
			{
				ref = (Employee) o; 
			}
			if(this.empid<ref.getEmpid()) //empid is the first elemnet and getEmpid is the secomd element
				return -1; 	//
					//For ascending oreder -1 .
			else if(this.empid >ref.getEmpid())
			{
				return +1; //Descending order +1
			}
			else
			{
				return 0;
			}
			
		}
		
		  
		
	
			
		
		}
		
		
		
		
		
		
		
		
		
		

