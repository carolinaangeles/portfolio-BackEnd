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
public class HardSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    private String viewBox;
    @Basic
    private String d;
    @Basic
    private String name;
    @Basic
    private String level;
    
    HardSkill(){
    }

    public HardSkill(long id, String viewBox, String d, String name, String level) {
        this.id = id;
        this.viewBox = viewBox;
        this.d = d;
        this.name = name;
        this.level = level;
    }
}
