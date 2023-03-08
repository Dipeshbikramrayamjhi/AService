package com.example.aservice.controller;

import com.example.aservice.dto.DepartmentDto;
import com.example.aservice.dto.ResponseDto;
import com.example.aservice.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/department")
public class DepartmentController extends ResponseController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/save")
    public ResponseEntity<ResponseDto> save (@Valid @RequestBody DepartmentDto departmentDto)
    {
        return ResponseEntity.ok(successResponse("Data is successfully inserted", HttpStatus.OK,HttpStatus.OK.value(), departmentService.save(departmentDto)));
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll()
    {
        return ResponseEntity.ok(successResponse("Displaying the department information",HttpStatus.OK,HttpStatus.OK.value(),departmentService.findAll()));
    }


}
