package com.example.demo11.model.request;

import com.example.demo11.entity.Education;
import com.example.demo11.entity.Experience;
import com.example.demo11.entity.User;
import com.example.demo11.entity.UserSkill;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class UpdateUserResquest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @Email
    private String email;
    private String address;
    private String description;
    private LocalDateTime dob;

    private List<Integer> educationIds;

    private List<Integer> experienceIds;

    private List<Integer> userSkillsIds;

    public User toUser(){
        return User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .phoneNumber(phoneNumber)
                .email(email)
                .address(address)
                .description(description)
                .dob(dob)
                .build();
    }
}
