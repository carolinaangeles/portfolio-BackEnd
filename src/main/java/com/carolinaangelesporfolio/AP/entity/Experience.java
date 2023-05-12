package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //importante
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
//ALT INSERT se hace todo automaticamente
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String job;
    private String company;
    private String endDate;
    private String startDate;
    @Lob //max 255 varchar, extiende capacidad
    private String description;
    private Long idPerson;
    
    public Experience(){
    }
    
    public Experience(Long id, String job, String company, String startDate, String endDate, String description, Long idPerson){
        this.id=id;
        this.job=job;
        this.company=company;
        this.startDate=startDate;
        this.endDate=endDate;
        this.description=description;
        this.idPerson=idPerson;
    }
}
    
    
    