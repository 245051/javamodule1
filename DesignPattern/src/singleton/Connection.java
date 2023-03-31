package singleton;

public class Connection {
	static Connection con; // Creating a static object of the class
	public static Connection getConnection() { //Creating the static method of the class
		if(con!=null)
		{
			return con;
		}
		else
		{
			con=new Connection(); //At first it will return else part.
			return con;
		}
		//return new Connection(); It will return new connections every time.
	}

}
