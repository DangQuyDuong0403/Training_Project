package com.example.demo11.repository;

import com.example.demo11.entity.Certification;
import com.example.demo11.entity.Experience;
import com.example.demo11.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CertificationRepository extends JpaRepository<Certification, Integer> {
    Page<Certification> findAllById(String name, Pageable pageable);
    @Query("SELECT u FROM Certification u")
    Page<Certification> findBy(String name, Pageable pageable);

}
