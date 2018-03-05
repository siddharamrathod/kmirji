package com.car24.CarDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.car24domain.entities.Miko;




public class CarMikoDaoImp implements CarMikoDao {
	
	
	@Autowired
    private SessionFactory sessionFactory;
  
    @Transactional
	public void addMiko(Miko miko) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(miko);
    }
 
    @Transactional
    public Miko getMikoById(int mikoId) {
        Session session = sessionFactory.getCurrentSession();      
        Miko miko = (Miko) session.get(Miko.class,mikoId);
        return miko;
    }
 

}
