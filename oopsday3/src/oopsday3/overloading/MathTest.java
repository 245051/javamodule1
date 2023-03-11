package oopsday3.overloading;

import java.util.Scanner;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math m = new Math();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		int result = m.add(j, i);
		
		System.out.println(result);
		int result2 = m.add(j, k, i);
		System.out.println(result);
		double l = sc.nextDouble();
		double n =sc.nextDouble();
		double result1 = m.add(l, n);
		System.out.println(result);
		result1 =m.add(101l, 102l,103l);
		
	}

}
