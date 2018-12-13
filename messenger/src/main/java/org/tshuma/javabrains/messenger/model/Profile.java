package org.tshuma.javabrains.messenger.model;

import java.util.Date;

public class Profile {
	private long id;
	private String firstName;
	private String profileName;
	private Date created;
	private String lastName;
	
	
	
	public Profile(long id, String firstName, String profileName,  String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.profileName = profileName;
		this.lastName = lastName;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Profile() {
		
	}
}
