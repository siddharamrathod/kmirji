package com.car24domain.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the store database table.
 * 
 */
@Entity
@NamedQuery(name="Store.findAll", query="SELECT s FROM Store s")
public class Store implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int storeId;

	private int mikoId;

	private String storeName;

	public Store() {
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getMikoId() {
		return this.mikoId;
	}

	public void setMikoId(int mikoId) {
		this.mikoId = mikoId;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}