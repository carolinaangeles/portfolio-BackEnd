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
public class CUser {
    
    @Autowired
    private SUser sUser;
    
    /*
    
    @PostMapping("/nuevaPersona/persona")
    public void agregar(@RequestBody User user){
        sUser.createUser(user);
    }
    
    
    @GetMapping("verPersona/personas")
    @ResponseBody
    public List<User> Listar(){
     
       return sUser.getUsers();
    }
    
    @DeleteMapping("/borrarPersona/{id}")
    public void borrar(@PathVariable long id){
        
     sUser.deleteUsers(id);
    }
    
    
    @PutMapping("/editarPersona")
    public void editar(@RequestBody Persona pers){
        
        sUser.editarPersona(pers);
    }
    
    
    @GetMapping("verUnaPersona/{id}")
    @ResponseBody
    public Persona verUno(@PathVariable int id){
    
        
        return sUser.buscarPersona(id);
    }
    
    */
    
    @PostMapping("/login")
    public boolean login(@RequestBody User user){
        User u= sUser.login(user.getEmail(), user.getPassword());
        if(u!=null)
            return true;
        else
            return false;
    }
    
}
