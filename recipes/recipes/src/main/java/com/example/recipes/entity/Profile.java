package com.example.recipes.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Profile {
	
	@Id
	private String id;
	private String email;
	private byte[] profilePic;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte[] getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}
	
	public Profile(String email, byte[] profilePic) {
		super();
		this.email = email;
		this.profilePic = profilePic;
	}
	
	public Profile() {

	}

}
