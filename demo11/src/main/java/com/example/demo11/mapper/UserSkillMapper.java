package com.example.demo11.mapper;

import com.example.demo11.dto.UserSkillDTO;
import com.example.demo11.entity.UserSkill;

public class UserSkillMapper {

    public static UserSkillDTO toUserSkillDTO(UserSkill userSkill) {
        UserSkillDTO userSkillDTO = new UserSkillDTO();
        userSkillDTO.setId(userSkill.getId());

        return userSkillDTO;
    }

    public static UserSkill toUserSkill(UserSkillDTO userSkillDTO) {
        UserSkill userSkill = new UserSkill();
        userSkill.setId(userSkillDTO.getId());

        return userSkill;
    }
}
