package TestLambda;
@FunctionalInterface
//An interface can have default methods and static methods.
//default keyword can only be given inside interface.
public interface TestInterface {
		public double method();
		public default void method2() {
			System.out.println("From method2");
		}
		public static void method3() {
			System.out.println("from static method");
		}
		
}
