package oopsdayLine;
import java.util.Scanner;
public class Linefun implements LineIface {

	@Override
	public void line(int  x1, int x2) {
		
		
		// TODO Auto-generated method stub
		int i=0;
		System.out.println(x1+x2);
		for(i = 0;i<=x1;i++)
		{
			System.out.print(" ");
			
		}
		for(i=x1;i<x2;i++)
		{
			System.out.print("-");
		}
	}

	
}
