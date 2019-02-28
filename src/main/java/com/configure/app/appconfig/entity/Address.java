package com.configure.app.appconfig.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5712689023464553953L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;

	@Column
	private String address;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
