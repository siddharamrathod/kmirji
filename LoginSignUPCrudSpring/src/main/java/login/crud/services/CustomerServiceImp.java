package login.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import login.crud.customerDao.CustomerDAO;
import login.crud.domain.Customer;
import login.crud.domain.model.Customerdb;

public class CustomerServiceImp implements CustomerService {
	
	@Autowired
    private CustomerDAO customerDAO;
	public void setcustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }
	
	
	public void addUpdateCustomer(Customerdb customer) {
		customerDAO.addUpdateCustomer(customer);
		
	}

	public void updateCustomer(Customerdb customer) {
		customerDAO.updateCustomer(customer);

	}

	public Customerdb getCustomerById(String username) {
		
		 return customerDAO.getCustomerById(username);
	}

	public void removeCustomer(String username) {
		customerDAO.removeCustomer(username);

	}

	public List<Customerdb> listCustomer() {
		
		 return this.customerDAO.listCustomer();
	
		
	}


}
