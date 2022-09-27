package com.javawithvipula.studentManagementSystem.services;

import com.javawithvipula.studentManagementSystem.exception.UserNotFoundException;
import com.javawithvipula.studentManagementSystem.model.Student;
import com.javawithvipula.studentManagementSystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) { // ***need ti clarify
        student.setStudentNumber(UUID.randomUUID().toString());
        return studentRepo.save(student);
    }
    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student){
        return studentRepo.save(student);
    }

    public Student findStudent(Long id){
        return studentRepo.findStudentById(id).orElseThrow(()-> new UserNotFoundException("user by id:" + id + "is not found"));
    }

    public void deleteStudent(Long id){
        studentRepo.deleteStudentById(id);
    }
}