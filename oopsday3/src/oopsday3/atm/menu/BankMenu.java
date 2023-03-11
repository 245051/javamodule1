package oopsday3.atm.menu;
import java.util.Scanner;

// Code execute when the object is executed.
public class BankMenu {
	BankOfAmerica2 boa = new BankOfAmerica2();
	public BankMenu() {	//We can initialize an object
		// TODO Auto-generated constructor stub
		Account a1 = new Account(101,"John Doe","savings",500);
		Account a2 = new Account(102,"John Doe","savings",510);
		Account a3 = new Account(103,"John Doe","salary",550);
		Account a4 = new Account(104,"John Doe","pension",509);
		Account a5 = new Account(105,"John Doe","pension",599);
		
		boa.addAccount(a1); //WE ARE storing the information to the bank data base.
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a2);
		boa.addAccount(a5);
	}

		
		public void menu() throws NegativeAmountException
		{
			System.out.println("1.Display Account ,2.Deposit,3.Withdraw,4.Balance enquiry,5.Exit,6.Continue");
		
		while(true) {
			
		System.out.print("Enter the option:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		
		
		
		
		switch(i){
			case 1:
			{
				System.out.println("Enter Account number:");
				int actno =sc.nextInt();
				boa.displayAccount(actno);
				break;
			
			 
			}
			case 2:
			{	
				System.out.println("Enter Account number:");
				int k =sc.nextInt();
				System.out.println("Enter the amount to be deposited");
				double l = sc.nextDouble();
				
				double balance = boa.deposit(l, k);
				System.out.println(balance);
				
				break;
			}
			case 3:
			{
				
				System.out.println("Enter Account number:");
				int o = sc.nextInt();
				System.out.println("Enter Amount");
				double p = sc.nextDouble();
				boa.withdraw(p, o);
				break;
			}
			case 4:
			{
				System.out.println("Enter the account number:");
				int q = sc.nextInt();
				boa.balance(q);
				
				break;
				
			}
			case 5:
			{
				System.exit(0);
			}
			
		}
		}
			
			
		}	
	
	
	
public static void main(String[] args) {
		
		}

		}	

	

