package com.example.aservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ambulance")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ambulance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;
    @Column(unique = true)
    private String email;

    private String password;

    private String vehicleNumber ;

    private String documentation;
    private String photo;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
