package com.example.demo11.repository;

import com.example.demo11.entity.Experience;
import com.example.demo11.entity.Skill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Integer> {
    Page<Skill> findAllById(String name, Pageable pageable);
    Page<Skill> findBy(String name, Pageable pageable);

}
