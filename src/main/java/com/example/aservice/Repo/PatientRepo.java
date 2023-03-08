package com.example.aservice.Repo;

import com.example.aservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {

}
