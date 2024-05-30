package com.example.demo11.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@EntityListeners(AuditingEntityListener.class)

@Table(name = "users")
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String description;
    private LocalDateTime dob;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Education> education;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Experience> experience;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserSkill> userSkills;


}