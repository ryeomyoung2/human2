package com.human.seoulroad.user;

import java.io.Serializable;

public class SessionUserDTO implements Serializable{
	private String name;
	private String email;
	private String nickname;
	
	public SessionUserDTO(SiteUser siteuser) {
		this.name = siteuser.getName();
		this.email = siteuser.getEmail();
		this.nickname = siteuser.getNickname();
	}
	
	public SessionUserDTO() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}