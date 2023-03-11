package oopsday4Statictest;

public class StaticDemo2 {
		static int a;
		public static void method() {
			System.out.println("From method"+a);
			// method 2() is notstatic
			
		}
		void method2()
		{
			method();
		}
		

}
