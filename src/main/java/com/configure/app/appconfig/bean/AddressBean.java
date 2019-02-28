package com.configure.app.appconfig.bean;

import java.io.Serializable;

import com.configure.app.appconfig.entity.Address;

public class AddressBean implements Serializable {

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AddressBean(Address address) {
		this.address=address.getAddress();
		
	}


}
