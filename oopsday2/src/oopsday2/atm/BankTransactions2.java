package oopsday2.atm;

public class BankTransactions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(101,"John Doe","savings",500);
		Account a2 = new Account(102,"John Doe","savings",510);
		Account a3 = new Account(103,"John Doe","salary",550);
		Account a4 = new Account(104,"John Doe","pension",509);
		Account a5 = new Account(105,"John Doe","pension",599);
		
		BankOfAmerica2 boa = new BankOfAmerica2(); // Bank of America 2 is having the code and arguments inorder to access that class we initialize that object.
 		boa.addAccount(a1);
		boa.addAccount(a4);
		boa.addAccount(a2);
		boa.addAccount(a5);
		
		
		
		System.out.println(boa.balance(103));
		double result = boa.deposit(100,103);
		System.out.println(result);
		result = boa.withdraw(50, 103);
		System.out.println(result);
	}

}
