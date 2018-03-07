package com.car24.CarServices;

import com.car24domain.entities.Store;

public interface StoreServices {
	
    public void addStore(Store store);
	
	public Store getStoreById(int storeId);

}
