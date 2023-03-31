package shape;
import java.util.Scanner;
import java.util.regex.*;
public class Substring {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();
		System.out.println("Enter the Start point:");
		int i = sc.nextInt();
		System.out.println("Enter the end point:");
		int j = sc.nextInt();
		System.out.println(s.substring(i,j));
	}

}
