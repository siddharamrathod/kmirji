package login.kavya.registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider{
	static Connection con=null;
	public static Connection getCon(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","Root@123");
			
		}catch(Exception e){
			
			System.out.println(e);
		}
		return con;
			
	}

}
