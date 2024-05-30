package com.example.demo11.model.response;

import com.example.demo11.entity.Education;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EducationResponse {
    private Integer id;
    private String schoolName;
    private String major;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;


    public static EducationResponse fromEducation(Education education) {
        return EducationResponse.builder()
                .id(education.getId())
                .schoolName(education.getSchoolName())
                .major(education.getMajor())
                .startDate(education.getStartDate())
                .endDate(education.getEndDate())
                .description(education.getDescription())
                .build();
    }
}
