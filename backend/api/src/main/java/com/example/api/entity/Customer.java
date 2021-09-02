package com.example.api.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true, columnDefinition = "VARCHAR(250)")
    private String name;

    @Column(nullable = true, columnDefinition = "VARCHAR(250)")
    private String lastname;

    @Column(nullable = false, columnDefinition = "VARCHAR(20)")
    private String dni;

    @Column(nullable = true, name = "date_of_birth")
    private LocalDate dateOfBirth; // date of birth


    

}
