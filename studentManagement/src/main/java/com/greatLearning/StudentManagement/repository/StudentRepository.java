package com.greatLearning.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatLearning.studentManagement.entity.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
