package com.example.aservice.Repo;

import com.example.aservice.model.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmbulanceRepo extends JpaRepository<Ambulance,Integer> {
}
