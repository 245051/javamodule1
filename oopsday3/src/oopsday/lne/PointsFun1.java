package oopsday.lne;
import java.util.Scanner;
public  class PointsFun1 implements LineIface {
	
	public PointsFun1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int points(int x1, int x2) {
		// TODO Auto-generated method stub
		for(int i=0;i<x1;i++) {
			System.out.print(" ");
		}
		for(int i=x1;i<=x2;i++) {
			System.out.print("-");
		}
	return 0;
		}
	@Override
	public int pointp1(int x1) {
		// TODO Auto-generated method stub
		System.out.println("Enetr the x");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); 
		return x;
	}
	@Override
	public int pointp2(int x2) {
		// TODO Auto-generated method stub
		System.out.println("Enetr the x");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}
	
	}

