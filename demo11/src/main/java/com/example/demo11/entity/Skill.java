package com.example.demo11.entity;

import com.example.demo11.enums.SkillName;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "skills")
public class Skill  extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private SkillName name;

    @OneToMany(mappedBy = "skill", cascade = CascadeType.ALL)
    private List<UserSkill> userSkills;

}