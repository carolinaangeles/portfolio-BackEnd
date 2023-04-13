
package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //importante
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity //Esto es un modelo.
//ALT INSERT se hace todo automaticamente
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String job;
    private String company;
    private String startDate; //'yyyy-mm-dd'
    private String endDate;
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
