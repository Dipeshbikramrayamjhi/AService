package com.example.aservice.dto;

import com.example.aservice.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDto {

    private  Integer id;


    private String email;

    private  String password ;


    private User user;
}
