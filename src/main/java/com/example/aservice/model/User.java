package com.example.aservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private String name;
    private  String contact ;
    private String address;
    private String location ;

    @ManyToMany
    @JoinTable(
            name = "userRole",
            joinColumns =@JoinColumn(name="uid" , referencedColumnName = "id" , foreignKey = @ForeignKey(name = "fk_hid")),
            inverseJoinColumns = @JoinColumn(name="rid" ,referencedColumnName = "id" , foreignKey = @ForeignKey(name = "fk_rid"))
    )
    private List<Role> roles;

}
