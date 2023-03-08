package com.example.aservice.service;

import com.example.aservice.dto.DepartmentDto;
import com.example.aservice.model.Department;

import java.util.List;

public interface DepartmentService {
    /**
     * to save the department information
     * @param departmentDto
     * @return departmentDto
     */
    DepartmentDto save (DepartmentDto departmentDto);

    /**
     * to display the information of department
     * @return list of department
     */
    List<DepartmentDto> findAll();




}
