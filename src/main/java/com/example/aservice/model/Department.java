package com.example.aservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "department")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String name;

    private String relatedDiseases ;

    private boolean status ;
    public Department(String name, String relatedDiseases) {
        this.name = name;
        this.relatedDiseases = relatedDiseases;
    }
}
