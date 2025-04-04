package com.steet.demo.services.interfaces;

import com.steet.demo.entities.Administrator;
import java.util.List;
import java.util.UUID;

public interface AdminServiceInt {
    Administrator createAdministrator(Administrator admin);
    Administrator updateAdministrator(UUID id, Administrator admin);
    boolean deleteAdministrator(UUID id);
    Administrator getAdministratorById(UUID id);
    List<Administrator> getAllAdministrators();
}