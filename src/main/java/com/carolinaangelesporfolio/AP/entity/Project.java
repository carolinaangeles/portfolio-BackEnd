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
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String image;
    //@Max(value=150,message="Máximo de caracteres permitidos:150")
    private String description;
    private String url;
    
    Project(){
    }

    public Project(long id, String title, String image, String description, String url) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.url = url;
    }
}
