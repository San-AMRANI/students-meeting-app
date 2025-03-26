package com.steet.demo.services.interfaces;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.steet.demo.entities.Student;

public interface StudentServiceInt {
   public Student saveStudent(Student student);
   public Optional<Student> getStudentById(UUID id);
   public Optional<Student> getStudentByEmail(String email);
   public Student getStudentByUserName(String userName);
   public Student updateStudent(Student student);
   public List<Student> getAllStudents();
   public boolean deleteStudent(UUID id);
}