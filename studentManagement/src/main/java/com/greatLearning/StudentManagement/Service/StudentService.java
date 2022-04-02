package com.greatLearning.StudentManagement.Service;

import java.util.List;

import com.greatLearning.studentManagement.entity.Student;


public interface StudentService {
	
	public List<Student> findAll;
	
	public void save (Student student);
	
	public void deleteById (int id);
	
	public Student findById( int id);

}
