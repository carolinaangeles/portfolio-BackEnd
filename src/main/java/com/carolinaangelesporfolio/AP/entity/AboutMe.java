package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AboutMe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    @Lob
    private String description;
    
    AboutMe(){
    }
    
    AboutMe(long id, String description){
        this.id = id;
        this.description = description;
    }
}
