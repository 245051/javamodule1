package MultiThread;

public class TestThread {
	public static void main(String[] args) {
		System.out.println("MAin Started");
		MyThread t1 = new MyThread("T1");
		MyThread t2 = new MyThread("T2");
		t1.start();
 		t2.start();
		System.out.println("MainMethod");
	}
}
