package com.carolinaangelesporfolio.AP.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Basic;
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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
@Getter @Setter

*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id_user;
    @Basic
    private String user_name;
    private String email;
    private String password;
    

   /*
   @OneToOne(mappedBy="user", cascade = CascadeType.ALL, fetch=FetchType.LAZY)
   @PrimaryKeyJoinColumn
   @JsonIgnore
   private Presentation presentation;
    */
   /*
   public User(){}

   public User(String user_name, String email, String password){
    this.user_name = user_name;
    this.email = email;
    this.password = password;
   }
    */
}
