package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String institution;
    @Temporal (TemporalType.DATE)
    private Date startDate;
    @Temporal (TemporalType.DATE)
    private Date endDate;
    @Lob //max 255 varchar
    private String url;
    private Long idPerson;
    
    
    
}
