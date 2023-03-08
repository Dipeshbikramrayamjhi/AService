package com.example.aservice.dto;

import com.example.aservice.model.Department;
import com.example.aservice.model.Hospital;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HospitalResponseDto {
    private int id ;

    @NotBlank(message = "Please enter name")
    private String name;
    @NotBlank(message = "Please enter name")
    private String address;
    @NotBlank(message = "Please enter contact")
    private  String contact;
    @NotBlank(message = "Please enter location")
    private String location ;
    @NotBlank(message = "Please Enter the email")
    private String email;

    @NotNull(message = "please Enter the department")
    private List<Department> did;
    private boolean status;

    public HospitalResponseDto(Hospital hospital) {
        this.id=hospital.getId();
        this.name= hospital.getName();
        this.address= hospital.getAddress();
        this.contact=hospital.getContact();
        this.location= hospital.getLocation();
        this.email= hospital.getEmail();
        this.did = hospital.getDepartmentList();
        this.status=hospital.isStatus();
    }
}
