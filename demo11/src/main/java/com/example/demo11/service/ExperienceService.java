package com.example.demo11.service;

import com.example.demo11.entity.Experience;
import com.example.demo11.exception.CustomException;
import com.example.demo11.mapper.ExperienceMapper;
import com.example.demo11.model.request.CreateExperienceRequest;
import com.example.demo11.model.request.UpdateExperienceRequest;
import com.example.demo11.model.response.ExperienceResponse;
import com.example.demo11.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService implements BaseService<Experience, Integer> {

    @Autowired
    private ExperienceRepository experienceRepository;
    private ExperienceMapper experienceMapper;


    public ExperienceResponse createExperience(CreateExperienceRequest request) {
//
        Experience certification = request.toExperience();
        Experience saved = experienceRepository.save(certification);


        return ExperienceResponse.fromExperience(saved);
    }

    public ExperienceResponse updateExperience(Integer id, UpdateExperienceRequest request){
        Experience experience = experienceRepository.findById(id).orElseThrow(() -> new RuntimeException("Experience not found"));


        experience.setCompanyName(request.toExperience().getCompanyName());
        experience.setStartDate(request.toExperience().getStartDate());
        experience.setEndDate(request.toExperience().getEndDate());
        experience.setPosition(request.toExperience().getPosition());
        experience.setDescription(request.toExperience().getDescription());
        Experience saved =experienceRepository.save(experience);
        return ExperienceResponse.fromExperience(saved);
    }

    public ExperienceResponse getExperience(Integer id) {
        if (id < 1) {
            throw new CustomException("Invalid id", HttpStatus.BAD_REQUEST);
        }

        Experience experience = experienceRepository.findById(id).orElseThrow(() -> new CustomException("Experience not found", HttpStatus.NOT_FOUND));
        return ExperienceResponse.fromExperience(experience);
    }

    public Page<ExperienceResponse> getExperience(String name,
                                                  Pageable pageable) {
        Page<Experience> experiences = experienceRepository.findBy(name, pageable);
        return experiences.map(ExperienceResponse::fromExperience);
    }

    public List<Experience> findAll() {
        return experienceRepository.findAll();
    }

    public Experience findById(Integer id) {
        return experienceRepository.findById(id).orElse(null);
    }

    public Experience save(Experience experience) {
        return experienceRepository.save(experience);
    }

    public void deleteById(Integer id) {
        experienceRepository.deleteById(id);
    }

}
