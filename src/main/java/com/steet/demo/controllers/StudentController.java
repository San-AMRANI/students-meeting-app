package com.steet.demo.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
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

   @MutationMapping
   public Student updateStudent(@Argument UUID id, @Argument Student student) {
      student.setId(id);
      return studentService.updateStudent(student);
   }

   @MutationMapping
   public boolean deleteStudent(@Argument UUID id) {
      return studentService.deleteStudent(id);
   }

   @QueryMapping
   public String signIn(@Argument String username, @Argument String password) {
      return studentService.signIn(username, password);
   }

   @QueryMapping
   public String joinPublicRoom(@Argument String roomId) {
      return studentService.joinPublicRoom(roomId);
   }

   @MutationMapping
   public String chat(@Argument String message) {
      return studentService.chat(message);
   }

   @MutationMapping
   public String createPrivateRoom(@Argument String roomName) {
      return studentService.createPrivateRoom(roomName);
   }

   @MutationMapping
   public String manageProfile(@Argument String profileData) {
      return studentService.manageProfile(profileData);
   }

   @QueryMapping
   public String receiveNotifications() {
      return studentService.receiveNotifications();
   }

   @MutationMapping
   public String reportUser(@Argument String userId) {
      return studentService.reportUser(userId);
   }

   @MutationMapping
   public String acceptInvitation(@Argument String invitationId) {
      return studentService.acceptInvitation(invitationId);
   }

   @MutationMapping
   public String rejectInvitation(@Argument String invitationId) {
      return studentService.rejectInvitation(invitationId);
   }
}