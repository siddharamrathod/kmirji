package com.car24.CarDao;

import javax.jms.Session;
import javax.management.Query;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;

import com.car24.CarDomain.CameraPojo;
import com.car24.CarDomain.MikoPojo;
import com.car24.CarDomain.StorePojo;
import com.car24domain.entities.Camera;

import antlr.collections.List;

public class CarDAOImp implements CarDAO {

	

	public CameraPojo getCARDetails(){
		     
       
       
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = (Session) sessionFactory.getCurrentSession();
		
		Query query = session.createSQLQuery("SELECT camera.cameraId,camera.cameraName,store.storeName,miko.mikoName from camera,store  INNER JOIN miko ON store.mikoId=miko.mikoId");
		List<Object[]> result = query.list();
		
		CameraPojo c=new CameraPojo();
		StorePojo s=new StorePojo();
		MikoPojo m=new MikoPojo();
	
		for(Object[] row : rows){
			 c.setCameraId(row[0].Integer.toString(CameraId));
				c.setCameraName(row[1].toString());
				s.setStoreName(row[2].toString());
				m.setMikoName(row[3].toString());	
		}
		
		 return c;
	}	 
	   
}
