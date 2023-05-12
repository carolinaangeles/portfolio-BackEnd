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
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    private String name;
    @Basic
    private String url;
    @Lob
    private String img;
    
    SocialMedia(){
    }

    public SocialMedia(long id, String name, String url, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.url = url;
    }
}
