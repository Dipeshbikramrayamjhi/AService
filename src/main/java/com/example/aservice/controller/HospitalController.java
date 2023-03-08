package com.example.aservice.controller;

import com.example.aservice.dto.HospitalRequestDto;
import com.example.aservice.dto.ResponseDto;
import com.example.aservice.service.HospitalService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController extends ResponseController {

    private final HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }
 @PostMapping("/save")
public ResponseEntity<ResponseDto> save(@Valid @RequestBody HospitalRequestDto hospitalRequestDto)
 {
 return ResponseEntity.ok(successResponse("Data is inserted Successfully",HttpStatus.OK,HttpStatus.OK.value(),hospitalService.save(hospitalRequestDto)));
 }
 @GetMapping("/findAll")
    public ResponseEntity<?> findAll()
 {
     return ResponseEntity.ok(successResponse("Displaying the hospital Data",HttpStatus.OK,HttpStatus.OK.value(),hospitalService.findAll()));
 }




}
