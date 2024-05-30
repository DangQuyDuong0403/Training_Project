package com.example.demo11.model.request;

import com.example.demo11.entity.Hobby;

public class CreateHobbyRequest {
    private String name;

    public Hobby toHobby(){
        return Hobby.builder()
                .name(name)
                .build();
    }
}
