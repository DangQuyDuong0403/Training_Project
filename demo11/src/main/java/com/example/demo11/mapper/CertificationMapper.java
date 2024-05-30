package com.example.demo11.mapper;

import com.example.demo11.dto.CertificationDTO;
import com.example.demo11.entity.Certification;

public class CertificationMapper {

    public static CertificationDTO toCertificationDTO(Certification certification) {
        CertificationDTO certificationDTO = new CertificationDTO();
        certificationDTO.setId(certification.getId());
        certificationDTO.setName(certification.getName());
        return certificationDTO;
    }

    public static Certification toCertification(CertificationDTO certificationDTO) {
        Certification certification = new Certification();
        certification.setId(certificationDTO.getId());
        certification.setName(certificationDTO.getName());

        return certification;
    }
}
