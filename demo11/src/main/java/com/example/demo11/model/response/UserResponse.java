package com.example.demo11.model.response;

import com.example.demo11.entity.Education;
import com.example.demo11.entity.Experience;
import com.example.demo11.entity.User;
import com.example.demo11.entity.UserSkill;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserResponse {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String description;
    private LocalDateTime dob;

    private List<EducationResponse> education;

    private List<ExperienceResponse> experience;

    private List<UserSkillResponse> userSkills;

    public static UserResponse fromUser(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .phoneNumber(user.getPhoneNumber())
                .email(user.getEmail())
                .address(user.getAddress())
                .description(user.getDescription())
                .dob(user.getDob())
                .education(user.getEducation().stream().map(EducationResponse::fromEducation).toList())
                .experience(user.getExperience().stream().map(ExperienceResponse::fromExperience).toList())
                .userSkills(user.getUserSkills().stream().map(UserSkillResponse::fromUserSkill).toList())
                .build();
    }
}
