package com.javawithvipula.studentManagementSystem;

import com.javawithvipula.studentManagementSystem.model.Student;
import com.javawithvipula.studentManagementSystem.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // controlling class
@RequestMapping("/student")
public class StudentControl {
    private final StudentService studentService;

    public StudentControl(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/allstudents") // get request to retrieve all the information
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students = studentService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/findstudent/{id}") // get request to retrieve all the information
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
        Student student = studentService.findStudent(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/addstudent") // post mapping for change the server side
    public ResponseEntity<Student> addStudent(@RequestBody Student student){ //@RequestBody for grab anything coming from user
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @PutMapping("/updatestudent")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){ //@RequestBody for grab anything coming from user
        Student updatedStudent = studentService.updateStudent(student);
        return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
    }

    @DeleteMapping("/deletestudent/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }


}
