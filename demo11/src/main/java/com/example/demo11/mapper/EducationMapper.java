package com.example.demo11.mapper;

import com.example.demo11.dto.EducationDTO;
import com.example.demo11.entity.Education;

public class EducationMapper {

    public static EducationDTO toEducationDTO(Education education) {
        EducationDTO educationDTO = new EducationDTO();
        educationDTO.setId(education.getId());
        educationDTO.setUser(education.getUser());
        educationDTO.setSchoolName(education.getSchoolName());
        educationDTO.setMajor(education.getMajor());
        educationDTO.setStartDate(education.getStartDate());
        educationDTO.setEndDate(education.getEndDate());
        educationDTO.setDescription(education.getDescription());

        return educationDTO;
    }

    public static Education toEducation(EducationDTO educationDTO) {
        Education education = new Education();
        education.setId(educationDTO.getId());
        education.setUser(educationDTO.getUser());
        education.setSchoolName(educationDTO.getSchoolName());
        education.setMajor(educationDTO.getMajor());
        education.setStartDate(educationDTO.getStartDate());
        education.setEndDate(educationDTO.getEndDate());
        education.setDescription(educationDTO.getDescription());

        return education;
    }
}
