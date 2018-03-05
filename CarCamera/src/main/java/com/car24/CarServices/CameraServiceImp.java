package com.car24.CarServices;

import org.springframework.beans.factory.annotation.Autowired;

import com.car24.CarDao.CarCameraDao;
import com.car24domain.entities.Camera;






public class CameraServiceImp implements CameraService {
	
	@Autowired
    private CarCameraDao carCameraDao;
	public void setCarCameraDao(CarCameraDao carCameraDao) {
        this.carCameraDao = carCameraDao;
    }
	
	public void addCamera(Camera camera) {
		carCameraDao.addCamera(camera);
		
	}
	
	public Camera getCameraById(int cameraId) {
		
		 return carCameraDao.getCameraById(cameraId);
	}


}
