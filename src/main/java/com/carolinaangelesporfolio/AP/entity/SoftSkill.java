
package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SoftSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    private String description;
    
    SoftSkill(){
    }

    public SoftSkill(long id, String description) {
        this.id = id;
        this.description = description;
    }
}
