package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elemnets");
		int s= sc.nextInt();
		System.out.println("Enter the elemnets:");
		for(int i=0;i<s;i++) {
			int j=sc.nextInt();
			arr.add(j);
		}
		System.out.println(arr);
		System.out.println("Enter the number of querires ");
		int k= sc.nextInt();
		
		for(int i=0;i<k;i++) {
			System.out.println("Enter the operation:");
			
			String m =sc.next();
			switch(m){
			case"insert":
			{
				System.out.println("Enter the location and number:");
				int k1 = sc.nextInt();
				int l= sc.nextInt();
				arr.add(k1, l);
				break;
			}
			case"delete":
			{
				System.out.println("Enter the location");
				int k2 = sc.nextInt();
				arr.remove(k2);
				break;
			}
			}
		}
		System.out.println(arr);
		
	}

}
