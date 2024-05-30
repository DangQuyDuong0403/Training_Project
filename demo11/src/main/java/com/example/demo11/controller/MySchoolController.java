package com.example.demo11.controller;

import com.example.demo11.entity.Education;
import com.example.demo11.service.MySchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myschool")
public class MySchoolController {

    @Autowired
    private MySchoolService mySchoolService;

    @GetMapping
    public List<Education> getAllMySchools() {
        return mySchoolService.getAllMySchools();
    }

    @GetMapping("/{id}")
    public Education getMySchoolById(@PathVariable Integer id) {
        return mySchoolService.getMySchoolById(id);
    }

    @PostMapping
    public Education createMySchool(@RequestBody Education mySchool) {
        return mySchoolService.saveMySchool(mySchool);
    }

    @PutMapping("/{id}")
    public Education updateMySchool(@PathVariable Integer id, @RequestBody Education mySchool) {
        mySchool.setId(id);
        return mySchoolService.saveMySchool(mySchool);
    }
}
