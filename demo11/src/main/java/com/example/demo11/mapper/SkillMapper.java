package com.example.demo11.mapper;

import com.example.demo11.dto.SkillDTO;
import com.example.demo11.entity.Skill;
import com.example.demo11.enums.SkillName;

public class SkillMapper {

    public static SkillDTO toSkillDTO(Skill skill) {
        SkillDTO skillDTO = new SkillDTO();
        skillDTO.setId(skill.getId());
        skillDTO.setName(String.valueOf(skill.getName()));

        return skillDTO;
    }

    public static Skill toSkill(SkillDTO skillDTO) {
        Skill skill = new Skill();
        skill.setId(skillDTO.getId());
        skill.setName(SkillName.valueOf(skillDTO.getName()));

        return skill;
    }
}
