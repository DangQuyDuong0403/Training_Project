package com.example.demo11.mapper;

import com.example.demo11.dto.ExperienceDTO;
import com.example.demo11.entity.Experience;

public class ExperienceMapper {

    public static ExperienceDTO toExperienceDTO(Experience experience) {
        ExperienceDTO experienceDTO = new ExperienceDTO();
        experienceDTO.setId(experience.getId());
        experienceDTO.setUser(experience.getUser());
        experienceDTO.setCompanyName(experience.getCompanyName());
        experienceDTO.setStartDate(experience.getStartDate());
        experienceDTO.setEndDate(experience.getEndDate());
        experienceDTO.setPosition(experience.getPosition());
        experienceDTO.setDescription(experience.getDescription());

        return experienceDTO;
    }

    public static Experience toExperience(ExperienceDTO experienceDTO) {
        Experience experience = new Experience();
        experience.setId(experienceDTO.getId());
        experience.setUser(experienceDTO.getUser());
        experience.setCompanyName(experienceDTO.getCompanyName());
        experience.setStartDate(experienceDTO.getStartDate());
        experience.setEndDate(experienceDTO.getEndDate());
        experience.setPosition(experienceDTO.getPosition());
        experience.setDescription(experienceDTO.getDescription());

        return experience;
    }
}
