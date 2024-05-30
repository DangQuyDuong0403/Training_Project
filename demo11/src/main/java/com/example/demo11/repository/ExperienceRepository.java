package com.example.demo11.repository;

import com.example.demo11.entity.Experience;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
    Page<Experience> findAllById(String name, Pageable pageable);
    @Query("SELECT u FROM Experience u")
    Page<Experience> findBy(String name, Pageable pageable);

}