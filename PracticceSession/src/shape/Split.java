package shape;

import java.util.ArrayList;
import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the  total amount:");
		int b = sc.nextInt();
		System.out.println("Enter the no. of people:");
		
		int a = sc.nextInt();
		for(int i =0;i<a;i++)
		{	System.out.println("Enter the amount:");
			int h = sc.nextInt();
		
			arr.add(h);
		}
		int sum=0;
		for(int i =0;i<a;i++)
		{
			sum +=arr.get(i); 
		}
		if(sum ==b)
		{
			System.out.println("The amount meeeted:");
		}
		else
		{
			System.out.println("Need more money:");
			int diff = b-sum;
			System.out.println("The balaance is:"+diff);
		}
		

	}

}
