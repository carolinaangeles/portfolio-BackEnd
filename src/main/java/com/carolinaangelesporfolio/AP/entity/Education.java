package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Basic;
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
    private long id;
    @Basic
    private String title;
    @Basic
    private String institution;
    @Basic
    @Temporal (TemporalType.DATE)
    private Date startDate;
    @Basic
    @Temporal (TemporalType.DATE)
    private Date endDate;
    @Basic
    private String url;
    
    Education(){
    }

    public Education(long id, String title, String institution, Date startDate, Date endDate, String url) {
        this.id = id;
        this.title = title;
        this.institution = institution;
        this.startDate = startDate;
        this.endDate = endDate;
        this.url = url;
    }
    
    
    
}
