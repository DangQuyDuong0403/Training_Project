package com.example.demo11.model.request;

import com.example.demo11.entity.Certification;
import com.example.demo11.entity.User;

public class CreateCertificationRequest {
    private String name;

    public Certification toCertification(){
        return Certification.builder()
                .name(name)
                .build();
    }
}
