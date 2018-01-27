package login.kavya.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginRegister() {
       
        
    } 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDAO cd=new CustomerDAOImpl();
		String username=request.getParameter("username");
		String password=request.getParameter("password1");
		String submitType=request.getParameter("submit");
		Customer c=cd.getCustomer(username, password);
		
		
		if(submitType.equals("login") && c!=null && c.getName()!=null){
			request.setAttribute("message", c.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			
		}else if(submitType.equalsIgnoreCase("register")){
			c.setName(request.getParameter("name"));
			c.setPassword(password);
			c.setUsername(username);
			cd.insertCustomer(c);
			
			request.setAttribute("message", "Registration done , please login to continue");
		    request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			request.setAttribute("message", "Data Not found,click on Register!!!");
		    request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
