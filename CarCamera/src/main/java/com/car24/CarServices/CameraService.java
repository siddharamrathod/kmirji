package com.car24.CarServices;

import com.car24domain.entities.Camera;

public interface CameraService {
	public void addCamera(Camera camera);
	
	public Camera getCameraById(int cameraId);

}
