package login.crud.customerDao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import login.crud.domain.Customer;
import login.crud.domain.model.Customerdb;



public class CustomerDAO {
	
	
	@Autowired
    private SessionFactory sessionFactory;
  
    @Transactional
	public void addUpdateCustomer(Customerdb customer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }
 
    @Transactional
    public void updateCustomer(Customerdb customer) {
        Session session = sessionFactory.getCurrentSession();
        session.update(customer);
    }
 
    
    @Transactional
    @SuppressWarnings("unchecked")
   
    public List<Customerdb> listCustomer() {
        Session session = sessionFactory.getCurrentSession();
        List<Customerdb> CustomerList = session.createQuery("from Customerdb").list();
        return CustomerList;
    }
 
    @Transactional
    public Customerdb getCustomerById(String username) {
        Session session = sessionFactory.getCurrentSession();      
        Customerdb customer = (Customerdb) session.get(Customerdb.class,username);
        return customer;
    }
 
    @Transactional
    public void removeCustomer(String username) {
        Session session = sessionFactory.getCurrentSession();
        Customerdb customer = (Customerdb) session.get(Customerdb.class, username);
        if(null != customer){
            session.delete(customer);
        }
}

}
	
	


