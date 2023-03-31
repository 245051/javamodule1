package oopsday3.atm.menu;

import oopsday3.atm.InsufficientFundsxception.InsufficientFundsxception;

public interface Banking2 {
	public double withdraw(double amount,int acctno)throws InsufficientFundsxception;// It will be implicitly abstract.
	public double deposit(double amount,double l)throws NegativeAmountException;
	public double balance(int actno);
}
