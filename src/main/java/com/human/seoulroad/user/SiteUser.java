package com.human.seoulroad.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Entity
@NoArgsConstructor
public class SiteUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(nullable = false)
    private String name;
	
    @Column(nullable = false)
    private String email;
    private String role = "ROLE_USER";
	
	@Column
	private String nickname;
	
	public SiteUser(String name, String email, String nickname){
		this.name = name;
		this.email = email;
		this.nickname = nickname;
	}
	
	public SiteUser update(String name) {
		this.name = name;
		
		return this;
	}	

}