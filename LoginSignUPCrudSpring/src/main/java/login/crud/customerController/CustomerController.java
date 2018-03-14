package login.crud.customerController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import login.crud.customerDao.CustomerDAO;
import login.crud.domain.Customer;
import login.crud.domain.model.Customerdb;
import login.crud.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/")
	public String welcome(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return "login";

	}

	@RequestMapping("/register")
	public String register(HttpServletRequest request, HttpServletResponse response,Model model)
			throws ServletException, IOException {
		model.addAttribute("customer", new Customer());
		return "register";

	}

	@RequestMapping("/LoginRegister")
	public String showMessage(@ModelAttribute("customer") Customer customer,
			BindingResult result,HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String submitType = request.getParameter("submit");
		Customerdb c = null;
		if (username != null) {
			c = customerService.getCustomerById(username);
		}

		System.out.println("Came");
		if (submitType != null) {
			if (submitType.equals("login") && c != null && c.getName() != null) {

				model.addAttribute("message", "Welcome");
				model.addAttribute("name", c.getName());
				return "welcome";

			} else if (submitType.equalsIgnoreCase("register")) {
				if(c==null){
					c = new Customerdb();
				}
				c.setName(request.getParameter("name"));
				c.setPassword(password);
				c.setUsername(username);
				customerService.addUpdateCustomer(c);

				model.addAttribute("message", "Registration done , please login to continue");

				return "login";
			}else{
				model.addAttribute("message", "Data Not found,click on Register!!!");
			}
		}

		

		return "login";

	}

	@RequestMapping("/customer")
	public String listCustomer(Model model) {
		
		model.addAttribute("customerList", customerService.listCustomer());
		return "customer";
	}

	@RequestMapping("/customer/remove/{username}")
	public String removecustomer(@PathVariable("username") String username) {

		customerService.removeCustomer(username);
		return "redirect:/customer";
	}

	@RequestMapping("/customer/register/edit/{username}")
	public String editcustomer(@PathVariable("username") String username, Model model) {
		
		model.addAttribute("customer", populateCustomerForm(customerService.getCustomerById(username)));
		model.addAttribute("customerList", customerService.listCustomer());
		return "register";
		
	}

	private Customer populateCustomerForm(Customerdb customerById) {
		Customer customer=new Customer();
		customer.setName(customerById.getName());
		customer.setPassword(customer.getPassword());
		customer.setUsername(customerById.getUsername());
		return customer;
	}
}