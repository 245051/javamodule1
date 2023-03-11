package oopsday2shape;

import java.security.PublicKey;

public class shapeArea implements shapeIface {

	
		// TODO Auto-generated method stub
		private double h;
		private double b;
		
		
		
		

	

	@Override
		public String toString() {
			return "shapeArea [h=" + h + ", b=" + b + "]";
		}







	public double getH() {
			return h;
		}







		public void setH(double h) {
			this.h = h;
		}







		public double getB() {
			return b;
		}







		public void setB(double b) {
			this.b = b;
		}







	public shapeArea(double h, double b) {
			super();
			this.h = h;
			this.b = b;
		}







	@Override
	public void area() {
		// TODO Auto-generated method stub
		int a =0;
		a = (int) (0.5*h*b);
		System.out.println(a);
	}

}
