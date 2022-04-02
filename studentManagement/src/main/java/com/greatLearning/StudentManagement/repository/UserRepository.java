package com.greatLearning.StudentManagement.repository;

import com.greatLearning.StudentManagement.Entity.User;

public interface UserRepository {
	
	public User getuserByUsername (String username);

}
