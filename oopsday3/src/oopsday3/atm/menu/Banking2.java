package oopsday3.atm.menu;

public interface Banking2 {
	public double withdraw(double amount,int acctno)throws InsufficientFundexception;// It will be implicitly abstract.
	public double deposit(double amount,double l)throws NegativeAmountException;
	public double balance(int actno);
}
