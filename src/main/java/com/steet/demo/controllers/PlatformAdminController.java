package com.steet.demo.controllers;

import com.steet.demo.entities.Administrator;
import com.steet.demo.services.implementations.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class PlatformAdminController {

   @Autowired
   private AdminService adminService;

   @QueryMapping
   public List<Administrator> administrators() {
      return adminService.getAllAdministrators();
   }

   @QueryMapping
   public Administrator administratorById(@Argument UUID id) {
      return adminService.getAdministratorById(id);
   }

   @MutationMapping
   public Administrator createAdministrator(@Argument Administrator admin) {
      return adminService.createAdministrator(admin);
   }

   @MutationMapping
   public Administrator updateAdministrator(@Argument UUID id, @Argument Administrator admin) {
      return adminService.updateAdministrator(id, admin);
   }

   @MutationMapping
   public boolean deleteAdministrator(@Argument UUID id) {
      return adminService.deleteAdministrator(id);
   }
}
