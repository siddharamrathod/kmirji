package com.car24.CarDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.car24domain.entities.Store;



public class CarStoreDaoImp implements CarStoreDao {
	
	@Autowired
    private SessionFactory sessionFactory;
  
    @Transactional
	public void addStore(Store store) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(store);
    }
 
    @Transactional
    public Store getStoreById(int storeId) {
        Session session = sessionFactory.getCurrentSession();      
        Store store = (Store) session.get(Store.class,storeId);
        return store;
    }
	

}
