package com.example.demo11.dto;

import com.example.demo11.entity.Skill;
import com.example.demo11.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSkillDTO {
    private Integer id;

    private Skill skill;

    private User user;
}
