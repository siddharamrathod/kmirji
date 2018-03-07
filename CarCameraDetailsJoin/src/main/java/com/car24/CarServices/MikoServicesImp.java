package com.car24.CarServices;

import org.springframework.beans.factory.annotation.Autowired;

import com.car24.CarDao.CarMikoDao;
import com.car24domain.entities.Miko;


public class MikoServicesImp implements MikoServices {

	@Autowired
    private CarMikoDao carMikoDao;
	public void setCarMikoDao(CarMikoDao carMikoDao) {
        this.carMikoDao = carMikoDao;
    }
	
	public void addMiko(Miko miko) {
		carMikoDao.addMiko(miko);
		
	}

	public Miko getMikoById(int mikoId) {
		
		return carMikoDao.getMikoById(mikoId);
	}

}
