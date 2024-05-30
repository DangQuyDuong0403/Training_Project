package com.example.demo11.model.response;

import com.example.demo11.entity.UserSkill;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserSkillResponse {
    private Integer id;

    public static UserSkillResponse fromUserSkill(UserSkill userSkill) {
        return UserSkillResponse.builder()
                .id(userSkill.getId())
                .build();
    }
}
