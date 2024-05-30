package com.example.demo11.model.request;

import com.example.demo11.entity.Education;

import java.time.LocalDateTime;

public class UpdateEducationRequest {
    private String schoolName;
    private String major;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;

    public Education toEducation(){
        return Education.builder()
                .schoolName(schoolName)
                .major(major)
                .startDate(startDate)
                .endDate(endDate)
                .description(description)
                .build();
    }
}
