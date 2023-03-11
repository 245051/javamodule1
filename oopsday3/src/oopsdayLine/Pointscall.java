package oopsdayLine;
import java.util.Scanner;
public class Pointscall {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Horizontal Line it requiers only 2 x coordinates");
		System.out.println("Enter the coordinates:");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enetr teh coordinate x2");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		Points p1 = new Points(x1, y1);//We are passing value during object creation.
		Points p2 = new Points(x2,y2);
		int x = p1.getX1();
		int m = p2.getX1();
		Linefun l = new Linefun();
		l.line(x,m);
		
		
		
	}

}
