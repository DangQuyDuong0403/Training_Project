package com.example.demo11.model.request;

import com.example.demo11.entity.Skill;
import com.example.demo11.enums.SkillName;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class CreateSkillRequest {
    @Enumerated(EnumType.STRING)
    private SkillName name;

    public Skill toSkill(){
        return Skill.builder()
                .name(name)
                .build();
    }
}
