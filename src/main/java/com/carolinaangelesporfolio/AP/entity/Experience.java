
package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //importante
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
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
    @Temporal (TemporalType.DATE)
    private Date startDate; //'yyyy-mm-dd'
    @Temporal (TemporalType.DATE)
    private Date endDate;
    @Lob //max 255 varchar
    private String description;
    private Long idPerson;
    
    public Experience(){
    }
    
    public Experience(Long id, String job, String company, Date startDate, Date endDate, String description, Long idPerson){
        this.id=id;
        this.job=job;
        this.company=company;
        this.startDate=startDate;
        this.endDate=endDate;
        this.description=description;
        this.idPerson=idPerson;
    }
    
    
    
    
    
}
