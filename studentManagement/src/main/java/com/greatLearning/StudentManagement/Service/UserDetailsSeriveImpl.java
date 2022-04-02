package com.greatLearning.StudentManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatLearning.StudentManagement.Entity.User;
import com.greatLearning.StudentManagement.repository.UserRepository;
import com.greatLearning.StudentManagement.security.MyUserDetails;

public class UserDetailsSeriveImpl implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.getuserByUsername(username);
		if (user ==null) {
			throw new UsernameNotFoundException("could not find user");
			
		}
		return new MyUserDetails (user);
	 
	}

}
