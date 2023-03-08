package com.example.aservice.controller;

import com.example.aservice.dto.PatientDto;
import com.example.aservice.dto.ResponseDto;
import com.example.aservice.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient")
public class PatientController extends ResponseController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }


    @PostMapping("/save")
    public ResponseEntity<ResponseDto> save (@Valid @RequestBody PatientDto patientDto)
    {
        return ResponseEntity.ok(successResponse("Data is inserted Successfully ", HttpStatus.OK,HttpStatus.OK.value(),patientService.save(patientDto)));
    }
}
