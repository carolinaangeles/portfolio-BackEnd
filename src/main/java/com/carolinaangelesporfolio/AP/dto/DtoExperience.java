package com.carolinaangelesporfolio.AP.dto;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class DtoExperience {
    
    private String job;
        
        //no tiene @id @generate...
        
    public DtoExperience(String job){
       this.job = job;
    }
}
