package com.example.demo11.model.request;

import com.example.demo11.entity.Certification;

public class UpdateCertificationRequest {
    private String name;

    public Certification toCertification(){
        return Certification.builder()
                .name(name)
                .build();
    }
}
