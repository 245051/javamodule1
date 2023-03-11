package oopsday2.atm;

public interface Banking2 {
	public double withdraw(double amount,int acctno); // It will be implicitly abstract.
	public double deposit(double amount,int aactno);
	public double balance(int actno);
}
