package com.steet.demo.controllers;

import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.steet.demo.services.implementations.MemberService;
import org.springframework.graphql.data.method.annotation.Argument;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @MutationMapping
    public String shareScreen(@Argument String roomId) {
        return memberService.shareScreen(roomId);
    }
}
