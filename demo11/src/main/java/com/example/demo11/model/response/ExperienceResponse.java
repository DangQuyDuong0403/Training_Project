package com.example.demo11.model.response;

import com.example.demo11.entity.Experience;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ExperienceResponse {
    private Integer id;
    private String companyName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String position;
    private String description;

    public static ExperienceResponse fromExperience(Experience experience) {
        return ExperienceResponse.builder()
                .id(experience.getId())
                .companyName(experience.getCompanyName())
                .startDate(experience.getStartDate())
                .endDate(experience.getEndDate())
                .position(experience.getPosition())
                .description(experience.getDescription())
                .build();
    }
}
