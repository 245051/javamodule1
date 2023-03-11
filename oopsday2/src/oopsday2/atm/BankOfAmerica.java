package oopsday2.atm;

public class BankOfAmerica implements Banking {
	
	private Account account = new Account(100010,"John","salary",500); 

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		account.setBalance(account.getBalance()-amount);
		return account.getBalance();
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		account.setBalance(account.getBalance()+amount);
		return account.getBalance();
	}

    
	
    @Override
	public double balance(int actno) {
		// TODO Auto-generated method stub
    	return 0.0;
		
	}

}
