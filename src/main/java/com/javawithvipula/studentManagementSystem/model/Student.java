package com.javawithvipula.studentManagementSystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity // map data into the database
public class Student implements Serializable {
    // serializable is help to convert this class in to other types

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String studentNumber;

    public Student() {
    }

    public Student(Long id, String name, String email, String phoneNumber, String imageURL, String studentNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.imageURL = imageURL;
        this.studentNumber = studentNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString(){
      return "Student{" +
      "id=" + id +
      ", name=" + name +
      ", email=" + email +
      ", phoneNumber=" + phoneNumber +
      ", imageURL=" + imageURL +
      "}";
    };
}
