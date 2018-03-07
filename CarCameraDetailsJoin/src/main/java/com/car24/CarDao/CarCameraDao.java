package com.car24.CarDao;

import com.car24domain.entities.Camera;

public interface CarCameraDao {
	
	public void addCamera(Camera camera);
	
    public Camera getCameraById(int cameraId);

}
