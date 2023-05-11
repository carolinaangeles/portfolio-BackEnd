package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.User;
import com.carolinaangelesporfolio.AP.service.SUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CUser {
    
    @Autowired
    private SUser sUser;
    
    
    @GetMapping("/estudios")
   //@ResponseBody
   public List<User> getUsers(){
       return sUser.getUsers();
   }
   
   @GetMapping("/estudio/{id}") //link = endpoint
   //@ResponseBody
   public User getUser(@PathVariable Long id){
       return sUser.getUser(id);
   }
   
   @PostMapping("/estudio/agregar")
   public void createUser (@RequestBody User u){
       sUser.createUser(u);
   }
   
   
   @PutMapping("/estudio/editar")
   public void editUser(@RequestBody User u){
        sUser.editUser(u);
   }
    
    /*
    
    @PostMapping("/login")
    public boolean login(@RequestBody User user){
        User u= sUser.login(user.getEmail(), user.getPassword());
        if(u!=null)
            return true;
        else
            return false;
    }*/
    
}
