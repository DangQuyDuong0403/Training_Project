package com.example.demo11.controller;


import com.example.demo11.entity.Certification;
import com.example.demo11.entity.Experience;
import com.example.demo11.exception.CustomException;
import com.example.demo11.mapper.CertificationMapper;
import com.example.demo11.mapper.ExperienceMapper;
import com.example.demo11.model.request.CreateCertificationRequest;
import com.example.demo11.model.request.CreateExperienceRequest;
import com.example.demo11.model.request.UpdateCertificationRequest;
import com.example.demo11.model.request.UpdateExperienceRequest;
import com.example.demo11.model.response.CertificationResponse;
import com.example.demo11.model.response.ExperienceResponse;
import com.example.demo11.repository.CertificationRepository;
import com.example.demo11.repository.ExperienceRepository;
import com.example.demo11.service.CertificationService;
import com.example.demo11.service.ExperienceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @Autowired
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }



    @GetMapping
    public Page<ExperienceResponse> getExperiences(
            @RequestParam(required = false) String name,
            Pageable pageable
    ) {
        return experienceService.getExperience(name, pageable);

    }

    @PostMapping
    public ExperienceResponse createExperience(@RequestBody @Valid CreateExperienceRequest request) {
        return experienceService.createExperience(request);
    }

    @GetMapping({"/{id}"})
    public ExperienceResponse getExperienece(@PathVariable Integer id) {
        return experienceService.getExperience(id);
    }

    @PutMapping({"/{id}"})
    public ExperienceResponse updateExperience(@PathVariable Integer id, @RequestBody @Valid UpdateExperienceRequest request) {
        return experienceService.updateExperience(id, request);
    }
}