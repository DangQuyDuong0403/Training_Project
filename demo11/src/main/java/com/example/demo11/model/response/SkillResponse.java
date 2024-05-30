package com.example.demo11.model.response;

import com.example.demo11.entity.Certification;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SkillResponse {
    private Integer id;
    private String name;

    public static SkillResponse fromCertification(SkillResponse skillResponse) {
        return SkillResponse.builder()
                .id(skillResponse.getId())
                .name(skillResponse.getName())
                .build();
    }
}
