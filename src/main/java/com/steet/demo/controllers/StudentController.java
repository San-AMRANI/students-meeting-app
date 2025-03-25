package com.steet.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}