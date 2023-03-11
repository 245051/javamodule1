package MultiThread;

import java.util.Scanner;

public class MyRunnable implements Runnable { //Run method is a entry point to child thread.
//When a class extends from other class then only it will become object of that class.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++)
		{
			
				System.out.println("Enetr your name:");
				int a = new Scanner(System.in).nextInt();
				System.out.println("Got the input proceeding:");
				System.out.println(Thread.currentThread().getName()+"="+i);
			
			 try { 
				 Thread.sleep(3000);
			 
			 }catch(InterruptedException e ) 
			 	{
				 e.printStackTrace(); 
				 }
			 
		}

	}

}
