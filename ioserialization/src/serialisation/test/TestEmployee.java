package serialisation.test;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestEmployee {//Writing an objet to the file
//How we can convert an object to byte.ie encrypted
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101,"John Doe",4000,"NinakeENTHINA");
		FileOutputStream fos = new FileOutputStream("emp.dat"); //To write data to file.
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
	}

}
