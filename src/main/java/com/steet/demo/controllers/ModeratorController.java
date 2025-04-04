package com.steet.demo.controllers;

import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.steet.demo.services.implementations.ModeratorService;
import org.springframework.graphql.data.method.annotation.Argument;

@Controller
public class ModeratorController {

    @Autowired
    private ModeratorService moderatorService;

    @MutationMapping
    public String inviteStudents(@Argument String roomId, @Argument String studentId) {
        return moderatorService.inviteStudents(roomId, studentId);
    }

    @MutationMapping
    public String kickMember(@Argument String roomId, @Argument String memberId) {
        return moderatorService.kickMember(roomId, memberId);
    }

    @MutationMapping
    public String promoteMember(@Argument String roomId, @Argument String memberId) {
        return moderatorService.promoteMember(roomId, memberId);
    }
}
