package com.example.aservice.service.serviceImpl;

import com.example.aservice.Repo.DepartmentRepo;
import com.example.aservice.dto.DepartmentDto;
import com.example.aservice.model.Department;
import com.example.aservice.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DepartmentServiceImpl  implements DepartmentService {

    private final DepartmentRepo departmentRepo;

    public DepartmentServiceImpl(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        Department department = new Department(departmentDto.getName(),departmentDto.getRelatedDiseases());
        department.setStatus(true);
        departmentRepo.save(department);
        return departmentDto;
    }

    @Override
    public List<DepartmentDto> findAll() {
        List<Department> departmentList = departmentRepo.findByStatusTrue();
        List<DepartmentDto> departmentDtos = new ArrayList<>();
        departmentList.forEach(department -> {
            DepartmentDto departmentDto = new DepartmentDto();
            departmentDto.setId(department.getId());
            departmentDto.setName(department.getName());
            departmentDto.setRelatedDiseases(department.getRelatedDiseases());
            departmentDto.setStatus(department.isStatus());
            departmentDtos.add(departmentDto);

        });

        return departmentDtos;
    }
}
