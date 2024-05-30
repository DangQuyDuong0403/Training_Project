package com.example.demo11.dto;

import com.example.demo11.entity.Education;
import com.example.demo11.entity.Experience;
import com.example.demo11.entity.UserSkill;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String description;
    private LocalDateTime dob;

    private List<Education> education;

    private List<Experience> experience;

    private List<UserSkill> userSkills;
}
