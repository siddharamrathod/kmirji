package com.car24.CarDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.management.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.car24.CarDomain.CameraPojo;
import com.car24domain.entities.Camera;






public class CarCameraDaoImp implements CarCameraDao{
	
	@Autowired
    private SessionFactory sessionFactory;

	
	
	static Connection con; 
	static PreparedStatement ps;
  
    @Transactional
	public void addCamera(Camera camera) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(camera);
    }
 
    @Transactional
    public Camera getCameraById(int cameraId) {
        Session session = sessionFactory.getCurrentSession();      
        Camera camera = (Camera) session.get(Camera.class,cameraId);
        return camera;
    }

	

}
