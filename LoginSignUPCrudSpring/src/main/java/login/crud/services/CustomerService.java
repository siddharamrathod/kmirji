package login.crud.services;

import java.util.List;

import login.crud.domain.Customer;
import login.crud.domain.model.Customerdb;

public interface CustomerService {
	
	 public void addUpdateCustomer(Customerdb customer);
	   
	    public void updateCustomer(Customerdb customer);
	   
	    public Customerdb getCustomerById(String username);
	   
	    public void removeCustomer(String username);
	   
	    public List<Customerdb> listCustomer();

}
