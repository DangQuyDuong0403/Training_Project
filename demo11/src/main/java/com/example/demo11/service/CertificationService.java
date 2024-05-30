package com.example.demo11.service;

import com.example.demo11.dto.CertificationDTO;
import com.example.demo11.dto.UserDTO;
import com.example.demo11.entity.Certification;
import com.example.demo11.entity.Education;
import com.example.demo11.entity.User;
import com.example.demo11.exception.CustomException;
import com.example.demo11.exception.NotFoundException;
import com.example.demo11.mapper.CertificationMapper;
import com.example.demo11.mapper.UserMapper;
import com.example.demo11.model.request.CreateCertificationRequest;
import com.example.demo11.model.request.CreateUserRequest;
import com.example.demo11.model.request.UpdateCertificationRequest;
import com.example.demo11.model.request.UpdateUserResquest;
import com.example.demo11.model.response.CertificationResponse;
import com.example.demo11.model.response.UserResponse;
import com.example.demo11.repository.CertificationRepository;
import com.example.demo11.repository.MySchoolRepository;
import com.example.demo11.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService{
    @Autowired
    private CertificationRepository certificationRepository;
    private CertificationMapper certificationMapper;


    public CertificationResponse createCertification(CreateCertificationRequest request) {
//
        Certification certification = request.toCertification();
        Certification saved = certificationRepository.save(certification);


        return CertificationResponse.fromCertification(saved);
    }

    public CertificationResponse updateCertification(Integer id, UpdateCertificationRequest request){
        Certification certification = certificationRepository.findById(id).orElseThrow(() -> new RuntimeException("Certification not found"));


        certification.setName(request.toCertification().getName());
        Certification saved =certificationRepository.save(certification);
        return CertificationResponse.fromCertification(saved);
    }

    public CertificationResponse getCertification(Integer id) {
        if (id < 1) {
            throw new CustomException("Invalid id", HttpStatus.BAD_REQUEST);
        }

        Certification certification = certificationRepository.findById(id).orElseThrow(() -> new CustomException("Certification not found", HttpStatus.NOT_FOUND));
        return CertificationResponse.fromCertification(certification);
    }

    public Page<CertificationResponse> getCertifications(String name,
                                       Pageable pageable) {
        Page<Certification> certifications = certificationRepository.findBy(name, pageable);
        return certifications.map(CertificationResponse::fromCertification);
    }

    public List<Certification> findAll() {
        return certificationRepository.findAll();
    }

    public Certification findById(Integer id) {
        return certificationRepository.findById(id).orElse(null);
    }

    public Certification save(Certification certification) {
        return certificationRepository.save(certification);
    }

    public void deleteById(Integer id) {
        certificationRepository.deleteById(id);
    }

}
