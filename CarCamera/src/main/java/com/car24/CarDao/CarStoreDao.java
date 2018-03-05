package com.car24.CarDao;

import com.car24domain.entities.Store;

public interface CarStoreDao {
	public void addStore(Store store);
    public Store getStoreById(int storeId);

}
