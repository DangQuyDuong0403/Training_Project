package com.example.demo11.model.response;

import com.example.demo11.entity.Certification;
import com.example.demo11.entity.Education;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CertificationResponse {
    private Integer id;
    private String name;

    public static CertificationResponse fromCertification(Certification certification) {
        return CertificationResponse.builder()
                .id(certification.getId())
                .name(certification.getName())
                .build();
    }
}
