package oopsday3.atm.menu;
import oopsday3.atm.InsufficientFundsxception.InsufficientFundsxception;
import oopsday3.atm.menu.InsufficientFundexception;
public class BankOfAmerica2 implements Banking2 {
	public BankOfAmerica2() {
		// TODO Auto-generated constructor stub
	}
	private Account[] accounts = new Account[5]; // We are creating array of objects.
	private int accountIndex = 0;

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public int getAccountIndex() {
		return accountIndex;
	}

	public void setAccountIndex(int accountIndex) {
		this.accountIndex = accountIndex;
	}
	public void displayAccount(int actno) {
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getActno() == actno) {
				System.out.println(accounts[i].getActno());
				System.out.println(accounts[i].getActype());
				System.out.println(accounts[i].getName());
				System.out.println(accounts[i].getBalance());
				
			}
		}
	}

	@Override
	public double withdraw(double amount, int actno) throws InsufficientFundsxception {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				if(accounts[i].getBalance()<amount)
				{
					throw new InsufficientFundsxception("Insufficient Fund");
				}
				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}

	public BankOfAmerica2(Account[] accounts) {
		super();
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length)
			accounts[this.accountIndex++] = account; // We are using this to take the current bank address as object.
		else
			System.out.println();
	}

	@Override
	public double deposit(double amount, double l) throws NegativeAmountException {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == l) {       //Searching for the account.
				if(amount<0) {
					throw new NegativeAmountException("Cannot Deposit -ve"+amount);
					
				}
				tempBal = accounts[i].getBalance(); // Storing the account balance into tempbal.
				tempBal += amount;
				accounts[i].setBalance(tempBal);  //Setting the balance into account[i].
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double balance(int actno) {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
				break; // break is given if the object is found we shouldnt perform any search.
			}
		}
		
		return tempBal;
	}

}
