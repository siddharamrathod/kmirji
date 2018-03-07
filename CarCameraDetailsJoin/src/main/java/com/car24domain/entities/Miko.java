package com.car24domain.entities;

import java.io.Serializable;
import javax.persistence.*;


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

}