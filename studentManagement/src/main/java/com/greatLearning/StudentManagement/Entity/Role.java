package com.greatLearning.StudentManagement.Entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "roles")
@Data

public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "role_id")
	private Integer id;
	
	@Column(name = "name")
	private String name;

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
