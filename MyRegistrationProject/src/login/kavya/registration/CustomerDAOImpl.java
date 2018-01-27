package login.kavya.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO {
    static Connection con; //connection
    static PreparedStatement ps; // prepared query
	@Override
	public int insertCustomer(Customer c) {
		int status=0;
		try{
			con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("insert into customer.customerdb values(?,?,?)");
			ps.setString(1, c.getUsername());//passing the parameter
			ps.setString(2, c.getPassword());
			ps.setString(3, c.getName());
		    status=ps.executeUpdate();//enter this data into data base
		    con.close();
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Customer getCustomer(String username, String password) {
		
		Customer c=new Customer();
        try{
        	con=MyConnectionProvider.getCon();
			ps=con.prepareStatement("select * from customer.customerdb where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setName(rs.getString(3));
				
			}
        	
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return c;
	}

}
