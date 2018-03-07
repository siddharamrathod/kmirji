package com.car24.CarServices;

import org.springframework.beans.factory.annotation.Autowired;


import com.car24.CarDao.CarStoreDao;
import com.car24domain.entities.Store;


public class StoreServicesImp implements StoreServices {

	@Autowired
    private CarStoreDao carStoreDao;
	public void setCarStoreDao(CarStoreDao carStoreDao) {
        this.carStoreDao = carStoreDao;
    }
	
	
	public void addStore(Store store) {
		carStoreDao.addStore(store);
		
	}

	public Store getStoreById(int storeId) {
		
		return carStoreDao.getStoreById(storeId);
	}

}
