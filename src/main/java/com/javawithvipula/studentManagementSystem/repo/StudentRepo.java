package com.javawithvipula.studentManagementSystem.repo;

import com.javawithvipula.studentManagementSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Long>{

    void deleteStudentById(Long id); // ** how did created this quarry method

    Optional<Student> findStudentById(Long id);
}