package com.example.aservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HospitalRequestDto {

    private int id;

    @NotBlank(message = "Please enter name")
    private String name;
    @NotBlank(message = "Please enter name")
    private String address;
    @NotBlank(message = "Please enter contact")
    private String contact;
    @NotBlank(message = "Please enter location")
    private String location;
    @NotBlank(message = "Please Enter the email")
    private String email;

    @NotNull(message = "please Enter the department")
    private List<Integer> did;
    private boolean status;

    public HospitalRequestDto(String name, String address, String contact, String location, String email) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.location = location;
        this.email = email;
    }


}
