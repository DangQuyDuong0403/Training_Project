package com.example.demo11.dto;

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
public class ExperienceDTO {
    private Integer id;

    private User user;

    private String companyName;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String position;
    private String description;
}
