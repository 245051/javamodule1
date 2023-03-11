package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Entered Main ......");
		String data = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader reader = new BufferedReader(isr); //It is reading input from user. we are creating an object using bufferreader.
		FileWriter	writer = new FileWriter("Namamdefile.txt"); //To write in the ifle.
		System.out.println("Enetr some text");
		data = reader.readLine();
		while(!data.equals("quit")) //Best way is to use do while loop
			
		{
			
			writer.write(data);
			data = reader.readLine(); //Creates throw exception so that main can call the exception. REad data to the program.
		//When a program starts executing from main and when it reaches to reader the main gets block.If we dont give any input then the next statement is not executed.
			//System.out.println("You have Entered "+data);
	    }
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("You have exited");
		
		
		
	}
	
	

}
