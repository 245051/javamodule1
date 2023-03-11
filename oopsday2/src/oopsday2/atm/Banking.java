package oopsday2.atm;

public interface Banking {
	public double withdraw(double amount); // It will be implicitly abstract.
	public double deposit(double amount);
	public double balance(int actno);
}
