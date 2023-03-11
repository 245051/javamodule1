package oopsday2.atm;

/// USed for creating structure for some data.
public class Account {
	private int actno;
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
