package com.steet.demo.services.implementations;

import com.steet.demo.services.interfaces.GuestServiceInt;
import org.springframework.stereotype.Service;

@Service
public class GuestService implements GuestServiceInt {

    @Override
    public String navigateExplore() {
        // Logic for navigating/exploring
        return "Navigation successful";
    }

    @Override
    public String signUp(String username, String password) {
        // Logic for signing up
        return "Sign-up successful";
    }
}
