package com.steet.demo.services.implementations;

import org.springframework.stereotype.Service;

@Service
public class ModeratorService {

    public String inviteStudents(String roomId, String studentId) {
        // Logic for inviting students
        return "Student invited";
    }

    public String kickMember(String roomId, String memberId) {
        // Logic for kicking a member
        return "Member kicked";
    }

    public String promoteMember(String roomId, String memberId) {
        // Logic for promoting a member
        return "Member promoted";
    }
}
