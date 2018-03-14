/**
 * 
 */
package login.crud.services;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import login.crud.customerDao.*;
import login.crud.domain.model.Customerdb;
import login.crud.services.CustomerServiceImp;


/**
 * @author nagaratna.mirji
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceUnitTest {

	@InjectMocks
	CustomerServiceImp customerService=new CustomerServiceImp();
	@Mock
	private CustomerDAO customerDAO;
	
	
	@Test
	public void testGetCustomerById(){
		
		//input param 
		String username="Kavya";
		
		//mocked object to be returned from DAO(which is also mock)
		Customerdb customer=Mockito.mock(Customerdb.class);
		
		//mocked dao returns the mocked object for my matching input when following line encounters in the block of code
		Mockito.when(customerDAO.getCustomerById(username)).thenReturn(customer);
		
		//call actual testable method and verify the lines and returned object
		
		//Got ,Read and follow some good tutorials ,you will get it hmm okay same we have to do in password also right?
		//that dependes dont follow same it depends on what line u r testing hmm okay
		//okay I have some work....Good night hmm k Gn
		Assert.assertEquals(customer,customerService.getCustomerById("Kavya"));
		
		
	}
	
	@Test
	public void  testlistCustomer()
	{
		
		
		List<Customerdb> listCustomer=new ArrayList<Customerdb>();
		Customerdb mockUser1 = Mockito.mock(Customerdb.class);
		
		Mockito.when(customerDAO.listCustomer()).thenReturn((List<Customerdb>) listCustomer);
		Assert.assertEquals(listCustomer,customerService.listCustomer());
		
		
	}


}
