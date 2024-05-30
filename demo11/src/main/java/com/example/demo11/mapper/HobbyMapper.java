package com.example.demo11.mapper;

import com.example.demo11.dto.HobbyDTO;
import com.example.demo11.entity.Hobby;

public class HobbyMapper {

    public static HobbyDTO toHobbyDTO(Hobby hobby) {
        HobbyDTO hobbyDTO = new HobbyDTO();
        hobbyDTO.setId(hobby.getId());
        hobbyDTO.setName(hobby.getName());

        return hobbyDTO;
    }

    public static Hobby toHobby(HobbyDTO hobbyDTO) {
        Hobby hobby = new Hobby();
        hobby.setId(hobbyDTO.getId());
        hobby.setName(hobbyDTO.getName());

        return hobby;
    }
}
