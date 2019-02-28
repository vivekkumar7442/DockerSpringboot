package com.configure.app.appconfig.bean;

import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

import com.configure.app.appconfig.entity.User;

public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1061242264781790784L;

	private Integer userId;

	private String userName;

	private String firstName;

	private String lastName;

	private Set<AddressBean> addresses;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserBean(User user) {
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.userId = user.getUserId();
		this.addresses = user.getAddresses().stream().map(AddressBean::new).collect(Collectors.toSet());

	}

	public Set<AddressBean> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<AddressBean> addresses) {
		this.addresses = addresses;
	}

}
