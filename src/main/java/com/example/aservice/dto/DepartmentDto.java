package com.example.aservice.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private int id;
    @NotEmpty(message = "please enter the name of department")
    private String name;

    @NotEmpty(message = "please enter the related Diseases")
    private String relatedDiseases;

    private boolean status ;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelatedDiseases(String relatedDiseases) {
        this.relatedDiseases = relatedDiseases;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
