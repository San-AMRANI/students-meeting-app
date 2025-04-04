package com.steet.demo.controllers;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.steet.demo.services.implementations.GuestService;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @QueryMapping
    public String navigateExplore() {
        return guestService.navigateExplore();
    }

    @QueryMapping
    public String signUp(String username, String password) {
        return guestService.signUp(username, password);
    }
}
