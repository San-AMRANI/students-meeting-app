package com.steet.demo.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.steet.demo.entities.Student;
import com.steet.demo.services.implementations.StudentService;

@Controller
public class StudentController {
   
   @Autowired
   private StudentService studentService;

   @QueryMapping
   public List<Student> students() {
      return studentService.getAllStudents();
   }

   @QueryMapping
   public Optional<Student> studentById(@Argument UUID id) {
      return studentService.getStudentById(id);
   }

   @QueryMapping
   public Optional<Student> studentByEmail(@Argument String email) {
      return studentService.getStudentByEmail(email);
   }

   @QueryMapping
   public Student studentByUserName(@Argument String userName) {
      return studentService.getStudentByUserName(userName);
   }
}