package com.example.aservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private  String contact;
    private String location ;

    @ManyToMany()
     @JoinTable(
             name = "linkedDepartment",
             joinColumns = @JoinColumn(name = "hid",referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_hid" )),
             inverseJoinColumns = @JoinColumn(name = "did",referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_did" ))
     )
    private List<Department> departmentList ;
    private boolean status = true;
    @Column(unique = true)
    private String email;

    public Hospital(String name, String address, String contact, String location,String email) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.location = location;
        this.email= email;
    }
}
