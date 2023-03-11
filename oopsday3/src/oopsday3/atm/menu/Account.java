package oopsday3.atm.menu;

/// USed for creating structure for some data.It just act as a data base in which we create a table have the colum and rows.
public class Account {
	private int actno; // Similar to database we are creating a structure in which were we would be able to store this data together.
	private String name;
	private String actype;
	private double balancew;
	
	public Account() {
		
	}
	public Account(int actno, String name, String actype, double balance) {
		super();
		this.actno = actno;
		this.name = name;
		this.actype = actype;
		this.balancew = balance;
	}
	public int getActno() {
		return actno;
	}
	public void setActno(int actno) {
		this.actno = actno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActype() {
		return actype;
	}
	public void setActype(String actype) {
		this.actype = actype;
	}
	public double getBalance() {
		return balancew;
	}
	public void setBalance(double balance) {
		this.balancew = balance;
	}
	@Override
	public String toString() {
		return "Account [actno=" + actno + ", name=" + name + ", actype=" + actype + ", balance=" + balancew + "]";
	}
	

}
