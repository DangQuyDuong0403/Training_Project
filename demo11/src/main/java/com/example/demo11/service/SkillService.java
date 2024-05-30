package com.example.demo11.service;

import com.example.demo11.entity.Skill;
import com.example.demo11.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService implements BaseService<Skill, Integer> {

    @Autowired
    private SkillRepository skillRepository;

    @Override
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill findById(Integer id) {
        Optional<Skill> skill = skillRepository.findById(id);
        return skill.orElse(null);
    }

    @Override
    @Transactional
    public Skill save(Skill skill) {
        return skillRepository.save(skill);
    }


    @Transactional
    public void deleteById(Integer id) {
        skillRepository.deleteById(id);
    }

    // Additional service methods specific to Skill
    public List<Skill> getAllSkills() {
        return findAll();
    }

    public Skill getSkillById(Integer id) {
        return findById(id);
    }

    public Skill saveSkill(Skill skill) {
        return save(skill);
    }

    public void deleteSkill(Integer id) {
        deleteById(id);
    }
}
