package com.example.aservice.service.serviceImpl;

import com.example.aservice.Repo.PatientRepo;
import com.example.aservice.dto.PatientDto;
import com.example.aservice.model.Patient;
import com.example.aservice.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepo patientRepo;

    public PatientServiceImpl(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    @Override
    public PatientDto save(PatientDto patientDto) {
        Patient patient = new Patient();
        patient.setUser(patientDto.getUser());
        patient.setEmail(patient.getEmail());
        patient.setPassword(patient.getPassword());
        patientRepo.save(patient);
        return patientDto;
    }

    @Override
    public List<PatientDto> findAll() {
        return null;
    }
}
