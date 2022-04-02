package com.greatLearning.StudentManagement.Entity;

import java.util.ArrayList;

import javax.persistence.*;

import java.util.List;

import lombok.Data;

@Entity
@Table(name = "users")
@Data

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  (name = "user_id")
	private  Long id;
	
	@Column  (name = "username")
	private String username;
	
	@Column  (name = "password")
	private String password;
	
	@ManyToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name = "user_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id"))
	private List<Role> roles = new ArrayList<>();

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getpassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public com.greatLearning.StudentManagement.security.List<com.greatLearning.StudentManagement.security.Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	public com.greatLearning.StudentManagement.security.List<com.greatLearning.StudentManagement.security.Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

}
