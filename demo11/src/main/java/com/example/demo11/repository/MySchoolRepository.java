package com.example.demo11.repository;

import com.example.demo11.entity.Education;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MySchoolRepository extends JpaRepository<Education, Integer> {
    Page<Education> findAllById(String name, Pageable pageable);
    Page<Education> findBy(String name, Pageable pageable);

}
