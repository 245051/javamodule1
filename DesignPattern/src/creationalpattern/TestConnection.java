package creationalpattern;

import singleton.Connection;

public class TestConnection {
	public static void main(String[] args) {
		
	// Similar to kesav each 	
//		Connection con1 = Connection.getConnection();
//		Connection con2 = Connection.getConnection(); //Since the class is static we can initialize it by class name itself.
		for(int i=0;i<=10;i++) {
			Connection con1 = Connection.getConnection();
			Connection con2 = Connection.getConnection();
			
			if(con1.hashCode()==con2.hashCode())
			{
				System.out.println("Singleton");
			}
			else
			{
				System.out.println("Not singleton");
			}
			
		}
		
	}

}
