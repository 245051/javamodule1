package oopsday6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Program task begins");
		Scanner sc = new Scanner( System.in);
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		// int c = a/b; it will lead to error.This error is ususlaly made by
		// developer.So java uses exceptionto handle this error

		
			int c = a / b; // ponit of exception System.out.println(c);

		} catch (ArithmeticException e) {	//arithmetic exception is an inbuilt exception.
			System.out.println("cannot divide by zero:");

		}catch(InputMismatchException e) {
			System.out.println("Invalid inout format:");
		}

		System.out.println("Program completed task:");
	}
}
