package com.example.demo11.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@Entity
@Builder
@Table(name = "certifications")
@AllArgsConstructor
@NoArgsConstructor
public class Certification extends BaseEntity {


    private String name;

}