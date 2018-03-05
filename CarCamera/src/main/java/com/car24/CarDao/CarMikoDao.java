package com.car24.CarDao;

import com.car24domain.entities.Miko;

public interface CarMikoDao {

	public void addMiko(Miko miko);
    public Miko getMikoById(int mikoId);
}
