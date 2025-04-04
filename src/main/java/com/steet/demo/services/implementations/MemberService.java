package com.steet.demo.services.implementations;

import com.steet.demo.services.interfaces.MemberServiceInt;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements MemberServiceInt {

    @Override
    public String shareScreen(String roomId) {
        // Logic for sharing screen
        return "Screen shared";
    }
}
