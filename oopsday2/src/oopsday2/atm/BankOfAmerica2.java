package oopsday2.atm;


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

	@Override
	public double withdraw(double amount, int actno) {
		// TODO Auto-generated method stub
		
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno )
			{
				
				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
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
	public double deposit(double amount, int actno) {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
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
