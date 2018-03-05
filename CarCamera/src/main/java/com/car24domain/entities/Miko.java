package com.car24domain.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the miko database table.
 * 
 */
@Entity
@NamedQuery(name="Miko.findAll", query="SELECT m FROM Miko m")
public class Miko implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int mikoId;

	private String mikoName;

	//bi-directional many-to-one association to Store
	@OneToMany(mappedBy="miko")
	private Set<Store> stores;

	public Miko() {
	}

	public int getMikoId() {
		return this.mikoId;
	}

	public void setMikoId(int mikoId) {
		this.mikoId = mikoId;
	}

	public String getMikoName() {
		return this.mikoName;
	}

	public void setMikoName(String mikoName) {
		this.mikoName = mikoName;
	}

	public Set<Store> getStores() {
		return this.stores;
	}

	public void setStores(Set<Store> stores) {
		this.stores = stores;
	}

	public Store addStore(Store store) {
		getStores().add(store);
		store.setMiko(this);

		return store;
	}

	public Store removeStore(Store store) {
		getStores().remove(store);
		store.setMiko(null);

		return store;
	}

}