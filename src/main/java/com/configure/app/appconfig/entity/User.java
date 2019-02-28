package com.configure.app.appconfig.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity(name = "user")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE,region="user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6412440206067897908L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	@Column
	private String userName;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", referencedColumnName = "userId")
	private Set<Address> addresses;

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

	public Set<Address> getAddresses() {
		if(addresses==null) {
			addresses=new HashSet<>();
		}
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	
	

}
