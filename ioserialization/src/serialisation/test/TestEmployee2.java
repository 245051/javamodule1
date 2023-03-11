package serialisation.test;
//Our object is a file we need to get that object from file.
import java.io.FileInputStream; //We are reading data
import java.io.IOException;
import java.io.ObjectInputStream;//Imput means bringing something from other file.
import java.io.ObjectOutputStream;

public class TestEmployee2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\ustcore\\ioserialization\\emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj =ois.readObject(); //To read the object
		Employee ref =(Employee)obj;
		System.out.println(ref);
		
		
	}

}
