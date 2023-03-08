package com.example.aservice.Repo;

import com.example.aservice.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  HospitalRepo extends JpaRepository<Hospital,Integer> {

     List<Hospital> findByStatusTrue();

     Hospital findByEmail(String email);

}
