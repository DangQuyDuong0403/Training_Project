package com.example.demo11.controller;

import com.example.demo11.entity.Hobby;
import com.example.demo11.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hobby")
public class HobbyController {

    @Autowired
    private HobbyService hobbyService;

    @GetMapping
    public List<Hobby> getAllHobbies() {
        return hobbyService.getAllHobbies();
    }

    @GetMapping("/{id}")
    public Hobby getHobbyById(@PathVariable Integer id) {
        return hobbyService.getHobbyById(id);
    }

    @PostMapping
    public Hobby createHobby(@RequestBody Hobby hobby) {
        return hobbyService.saveHobby(hobby);
    }

    @PutMapping("/{id}")
    public Hobby updateHobby(@PathVariable Integer id, @RequestBody Hobby hobby) {
        hobby.setId(id);
        return hobbyService.saveHobby(hobby);
    }
}
