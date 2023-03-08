package com.example.aservice.service;

import com.example.aservice.dto.PatientDto;

import java.util.List;

public interface PatientService {

    /**
     * to save the patient data with its information .this method save data into two table patient table and users table
     * @param patientDto
     * @return patientDto
     */
  PatientDto save(PatientDto patientDto);

    /**
     * to find the data of patient form patient table and users table
     * @return List of PatientDto
     */
  List<PatientDto> findAll();
}
