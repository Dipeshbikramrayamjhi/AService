package com.example.aservice.service;

import com.example.aservice.dto.HospitalRequestDto;
import com.example.aservice.dto.HospitalResponseDto;

import java.util.List;

public interface HospitalService {

    /**
     * to save the hospital information
     * @param hospitalRequestDto
     * @return hospitalRequestDto
     */
    HospitalResponseDto save(HospitalRequestDto hospitalRequestDto);

    /**
     * to display all the value of hospital information
     * @return hospitalDto
     */
    List<HospitalResponseDto> findAll();

    /**
     * to display hospital information by id
     * @param id
     * @return hospitalDto
     */
    HospitalResponseDto findById(int id);

    /**
     * to display data from email of hospital
     * @param email
     * @return hospitalDto
     */
    HospitalResponseDto findByEmail(String email);


}
