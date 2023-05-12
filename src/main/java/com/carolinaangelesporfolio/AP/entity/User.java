package com.carolinaangelesporfolio.AP.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_user;
    @Basic
    private String email;
    private String password;
    
    /*
   public User(){}

   public User(String email, String password){
    this.email = email;
    this.password = password;
   }
   
   
   @OneToOne(mappedBy="user", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
   @PrimaryKeyJoinColumn
   @JsonIgnore
   private Presentation presentation;
    */
   

}