
package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; //importante
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity //Esto es un modelo.
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String job;
    
}
