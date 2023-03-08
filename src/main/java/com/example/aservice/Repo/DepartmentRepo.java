package com.example.aservice.Repo;

import com.example.aservice.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

   List<Department> findByStatusTrue();
//   List<Department> findAllById(List<Integer> id);
}
