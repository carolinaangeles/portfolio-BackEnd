package com.carolinaangelesporfolio.AP.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_user;
    @Lob
    private String user_name;
    private String email;
    private String password;
    

   /*
   @OneToOne(mappedBy="user", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
   @PrimaryKeyJoinColumn
   @JsonIgnore
   private Presentation presentation;
    */
   
   public User(){}

   public User(String user_name, String email, String password){
    this.user_name = user_name;
    this.email = email;
    this.password = password;
   }
    
}
