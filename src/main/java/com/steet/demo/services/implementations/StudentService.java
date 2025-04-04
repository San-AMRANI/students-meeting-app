package com.steet.demo.services.implementations;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.steet.demo.entities.Student;
import com.steet.demo.repositories.StudentRepository;
import com.steet.demo.services.interfaces.StudentServiceInt;

@Service
public class StudentService implements StudentServiceInt {

   private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

   @Autowired
   private StudentRepository studentRepository;

   @Override
   public Student saveStudent(Student student) {
      if (student == null) {
         logger.error("Attempted to save a null student");
         throw new IllegalArgumentException("Student cannot be null");
      }
      if (studentRepository.existsById(student.getId())) {
         logger.warn("Student with ID: {} already exists. Updating the existing record.", student.getId());
      }
      logger.info("Saving student with ID: {}", student.getId());
      return studentRepository.save(student);
   }

   @Override
   public Optional<Student> getStudentById(UUID id) {
      if (id == null) {
         logger.error("Attempted to fetch a student with a null ID");
         throw new IllegalArgumentException("ID cannot be null");
      }
      logger.info("Fetching student with ID: {}", id);
      Optional<Student> student = studentRepository.findById(id);
      if (student.isEmpty()) {
         logger.warn("No student found with ID: {}", id);
      }
      return student;
   }

   @Override
   public Optional<Student> getStudentByEmail(String email) {
      if (email == null || email.isEmpty()) {
         logger.error("Attempted to fetch a student with a null or empty email");
         throw new IllegalArgumentException("Email cannot be null or empty");
      }
      logger.info("Fetching student with email: {}", email);
      Optional<Student> student = studentRepository.findByEmail(email);
      if (student == null) {
         logger.warn("No student found with email: {}", email);
      }
      return student;
   }

   @Override
   public Student getStudentByUserName(String userName) {
      if (userName == null || userName.isEmpty()) {
         logger.error("Attempted to fetch a student with a null or empty username");
         throw new IllegalArgumentException("Username cannot be null or empty");
      }
      logger.info("Fetching student with username: {}", userName);
      Student student = studentRepository.findByUserName(userName);
      if (student == null) {
         logger.warn("No student found with username: {}", userName);
      }
      return student;
   }

   @Override
   public Student updateStudent(Student student) {
      if (student == null || student.getId() == null) {
         logger.error("Attempted to update a null student or student with null ID");
         throw new IllegalArgumentException("Student and Student ID cannot be null");
      }
      if (studentRepository.existsById(student.getId())) {
         logger.info("Updating student with ID: {}", student.getId());
         return studentRepository.save(student);
      } else {
         logger.warn("No student found with ID: {} to update", student.getId());
         return null;
      }
   }

   @Override
   public List<Student> getAllStudents() {
      logger.info("Fetching all students");
      List<Student> students = studentRepository.findAll();
      if (students.isEmpty()) {
         logger.warn("No students found in the database");
      }
      return students;
   }

   @Override
   public boolean deleteStudent(UUID id) {
      if (id == null) {
         logger.error("Attempted to delete a student with a null ID");
         throw new IllegalArgumentException("ID cannot be null");
      }
      if (studentRepository.existsById(id)) {
         logger.info("Deleting student with ID: {}", id);
         studentRepository.deleteById(id);
         return true;
      } else {
         logger.warn("No student found with ID: {} to delete", id);
         return false;
      }
   }
}
