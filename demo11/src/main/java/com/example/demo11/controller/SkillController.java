package com.example.demo11.controller;

import com.example.demo11.entity.Skill;
import com.example.demo11.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping
    public List<Skill> getAllSkills() {
        return skillService.getAllSkills();
    }

    @GetMapping("/{id}")
    public Skill getSkillById(@PathVariable Integer id) {
        return skillService.getSkillById(id);
    }

    @PostMapping
    public Skill createSkill(@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }

    @PutMapping("/{id}")
    public Skill updateSkill(@PathVariable Integer id, @RequestBody Skill skill) {
        skill.setId(id);
        return skillService.saveSkill(skill);
    }
}
