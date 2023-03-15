package oopsday4.composition;

import java.util.Objects;

public class Employee extends Person {
					// is-a relation ship
		private long empid;
		private String deptno;
		private double salary;
		private Address residenceaddress; 
	
		private String gender;
		
		//taking user defined class as a data member.
		//has-a relationship talks about composition.
		private Address correspondenceAddress; // has -a relationship.
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		
		public Address getResidenceaddress() {
			return residenceaddress;
		}


		public void setResidenceaddress(Address residenceaddress) {
			this.residenceaddress = residenceaddress;
		}


		public Address getCorrespondenceAddress() {
			return correspondenceAddress;
		}


		public void setCorrespondenceAddress(Address correspondenceAddress) {
			this.correspondenceAddress = correspondenceAddress;
		}


		public Employee(String name,String gender ,int age,long empid, String deptno, double salary, Address residenceaddress,
				Address correspondenceAddress) {
			super(name,gender,age);
			
			this.empid = empid;
			this.deptno = deptno;
			this.salary = salary;
			this.residenceaddress = residenceaddress;
			this.correspondenceAddress = correspondenceAddress;
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
		
		  
		 /* public int hashCode() { // TODO Auto-generated method stub int code
		  }
		 */
			
		
		}
		
		
		
		
		
		
		
		
		
		

