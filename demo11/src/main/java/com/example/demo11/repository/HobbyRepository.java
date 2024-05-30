package com.example.demo11.repository;

import com.example.demo11.entity.Experience;
import com.example.demo11.entity.Hobby;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Integer>{
    Page<Hobby> findAllById(String name, Pageable pageable);
    Page<Hobby> findBy(String name, Pageable pageable);

}
