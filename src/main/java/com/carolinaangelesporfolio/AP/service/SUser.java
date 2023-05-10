package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.User;
import com.carolinaangelesporfolio.AP.repository.RUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SUser {
    
    @Autowired
    public RUser rUser;
    
    public List<User> getUser(){
        
        return rUser.findAll();
    }
    
    public void createUser(User user){
        
        rUser.save(user);
    }
    
    
    public void deleteUser(long id){
    
        rUser.deleteById(id);
    }
    
    
    public User findUser(long id){
    
        return rUser.findById(id).orElse(null);
    }
    
    public void editUser(User user){
    
        rUser.save(user);
    }


    public User login(String email, String password){
       return rUser.findByEmailAndPassword(email, password);
        
    }
}
