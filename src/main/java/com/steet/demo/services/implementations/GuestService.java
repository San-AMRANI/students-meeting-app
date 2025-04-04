package com.steet.demo.services.implementations;

import org.springframework.stereotype.Service;

@Service
public class GuestService {

    public String navigateExplore() {
        // Logic for navigating/exploring
        return "Navigation successful";
    }

    public String signUp(String username, String password) {
        // Logic for signing up
        return "Sign-up successful";
    }
}
