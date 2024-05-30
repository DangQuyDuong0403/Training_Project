package com.example.demo11.model.request;

import com.example.demo11.entity.Experience;

import java.time.LocalDateTime;

public class UpdateExperienceRequest {
    private String companyName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String position;
    private String description;

    public Experience toExperience(){
        return Experience.builder()
                .companyName(companyName)
                .startDate(startDate)
                .endDate(endDate)
                .position(position)
                .description(description)
                .build();
    }
}
