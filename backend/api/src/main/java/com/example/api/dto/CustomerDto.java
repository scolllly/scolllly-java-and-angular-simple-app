package com.example.api.dto;

import java.time.LocalDate;
import java.time.Period;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.*;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class CustomerDto {

    private Integer id;

    
    private String name;    
    private String lastname;

    @NotNull
    private String dni;
    private LocalDate dateOfBirth; // date of birth
    private int age;

    // public int setCalculatedAge(){
    //     int age = 0;

    //     LocalDate today = LocalDate.now();        
    //     age = Period.between(this.dateOfBirth, today).getYears();

    //     return age;
    // }

    public void calculateAge(){
         this.age = 0;

         LocalDate today = LocalDate.now();        
         this.age = Period.between(this.dateOfBirth, today).getYears();
    }

    
    
}
