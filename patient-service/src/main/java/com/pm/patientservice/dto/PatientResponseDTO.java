package com.pm.patientservice.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PatientResponseDTO {
    private String id;
    private String name;
    private String email;
    private String address;
    private String dateOfBirth;
}
