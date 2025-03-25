package com.steet.demo.services.implementations;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steet.demo.entities.Student;
import com.steet.demo.repositories.StudentRepository;
import com.steet.demo.services.interfaces.StudentServiceInt;


@Service
public class StudentService implements StudentServiceInt {

   @Autowired
   private StudentRepository studentRepository;

   @Override
   public Student saveStudent(Student student) {
      return studentRepository.save(student);
   }

   @Override
   public Optional<Student> getStudentById(UUID id) {
      Optional<Student> student = studentRepository.findById(id);
      return student;
   }

   @Override
   public Student getStudentByEmail(String email) {
      return studentRepository.findByEmail(email);
   }

   @Override
   public Student getStudentByUserName(String userName) {
      return studentRepository.findByUserName(userName);
   }

   @Override
   public Student updateStudent(Student student) {
      if (studentRepository.existsById(student.getId())) {
         return studentRepository.save(student);
      }
      return null;
   }

   @Override
   public List<Student> getAllStudents() {
      return studentRepository.findAll();
   }
}
