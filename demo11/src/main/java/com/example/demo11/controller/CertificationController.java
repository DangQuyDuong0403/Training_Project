package com.example.demo11.controller;

import com.example.demo11.dto.CertificationDTO;
import com.example.demo11.dto.UserDTO;
import com.example.demo11.entity.Certification;
import com.example.demo11.model.request.CreateCertificationRequest;
import com.example.demo11.model.request.CreateUserRequest;
import com.example.demo11.model.request.UpdateCertificationRequest;
import com.example.demo11.model.request.UpdateUserResquest;
import com.example.demo11.model.response.CertificationResponse;
import com.example.demo11.model.response.UserResponse;
import com.example.demo11.service.CertificationService;
import com.example.demo11.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certification")
public class CertificationController {

    @Autowired
    private CertificationService certificationService;

    @Autowired
    public CertificationController(CertificationService certificationService) {
        this.certificationService = certificationService;
    }



    @GetMapping
    public Page<CertificationResponse> getCertifications(
            @RequestParam(required = false) String name,
            Pageable pageable
    ) {
        return certificationService.getCertifications(name, pageable);

    }

    @PostMapping
    public CertificationResponse createUser(@RequestBody @Valid CreateCertificationRequest request) {
        return certificationService.createCertification(request);
    }

    @GetMapping({"/{id}"})
    public CertificationResponse getUser(@PathVariable Integer id) {
        return certificationService.getCertification(id);
    }

    @PutMapping({"/{id}"})
    public CertificationResponse updateUser(@PathVariable Integer id, @RequestBody @Valid UpdateCertificationRequest request) {
        return certificationService.updateCertification(id, request);
    }
}
