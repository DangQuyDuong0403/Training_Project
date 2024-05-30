package com.example.demo11.repository;

import com.example.demo11.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository extends JpaRepository<BaseEntity, Integer> {
}
