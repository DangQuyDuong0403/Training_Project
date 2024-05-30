package com.example.demo11.service;

import com.example.demo11.entity.Education;
import com.example.demo11.repository.MySchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MySchoolService {

    @Autowired
    private MySchoolRepository mySchoolRepository;

    public List<Education> getAllMySchools() {
        return mySchoolRepository.findAll();
    }

    public Education getMySchoolById(Integer id) {
        return mySchoolRepository.findById(id).orElse(null);
    }

    public Education saveMySchool(Education mySchool) {
        return mySchoolRepository.save(mySchool);
    }

    public void deleteMySchool(Integer id) {
        mySchoolRepository.deleteById(id);
    }

    public List<Education> findAll() {
        return mySchoolRepository.findAll();
    }
}
