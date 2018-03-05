package com.car24domain.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the camera database table.
 * 
 */
@Entity
@NamedQuery(name="Camera.findAll", query="SELECT c FROM Camera c")
public class Camera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CAMERA_CAMERAID_GENERATOR", sequenceName="ORDER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAMERA_CAMERAID_GENERATOR")
	private int cameraId;

	private String cameraName;

	//bi-directional many-to-one association to Store
	@ManyToOne
	@JoinColumn(name="storeId")
	private Store store;

	public Camera() {
	}

	public int getCameraId() {
		return this.cameraId;
	}

	public void setCameraId(int cameraId) {
		this.cameraId = cameraId;
	}

	public String getCameraName() {
		return this.cameraName;
	}

	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}

	public Store getStore() {
		return this.store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

}