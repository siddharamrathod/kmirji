package com.car24domain.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


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

	private String storeName;

	//bi-directional many-to-one association to Camera
	@OneToMany(mappedBy="store")
	private Set<Camera> cameras;

	//bi-directional many-to-one association to Miko
	@ManyToOne
	@JoinColumn(name="mikoId")
	private Miko miko;

	public Store() {
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Set<Camera> getCameras() {
		return this.cameras;
	}

	public void setCameras(Set<Camera> cameras) {
		this.cameras = cameras;
	}

	public Camera addCamera(Camera camera) {
		getCameras().add(camera);
		camera.setStore(this);

		return camera;
	}

	public Camera removeCamera(Camera camera) {
		getCameras().remove(camera);
		camera.setStore(null);

		return camera;
	}

	public Miko getMiko() {
		return this.miko;
	}

	public void setMiko(Miko miko) {
		this.miko = miko;
	}

}