package com.car24.CarDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.car24domain.entities.Camera;




public class CarCameraDaoImp implements CarCameraDao{
	
	@Autowired
    private SessionFactory sessionFactory;
  
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
