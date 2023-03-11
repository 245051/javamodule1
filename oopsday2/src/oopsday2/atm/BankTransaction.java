package oopsday2.atm;

public class BankTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOfAmerica bom = new  BankOfAmerica();
		double balance = bom.deposit(250);
		System.out.println("Balance after deposit"+balance);
		balance =bom.withdraw(175.25);
		System.out.println("Balance after withdrawal is"+balance);
	}

}
