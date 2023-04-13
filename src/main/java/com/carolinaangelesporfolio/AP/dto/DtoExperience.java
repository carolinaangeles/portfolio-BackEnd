package com.carolinaangelesporfolio.AP.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
//import javax.validation.constraints.NotBlank;

@Getter @Setter
@Entity
public class DtoExperience {
    //@NotBlank
    private String job;
        
        //no tiene @id @generate...
        
    public DtoExperience(String job){
       this.job = job;
    }
}
