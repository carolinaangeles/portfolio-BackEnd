package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.User;
import com.carolinaangelesporfolio.AP.repository.RUser;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class SUser {
    
    private final RUser rUser;
    
    public List<User> getUsers(){
        
        return rUser.findAll();
    }
    
    public void createUser(User user){
        
        rUser.save(user);
    }
    
    
    public void deleteUser(long id){
    
        rUser.deleteById(id);
    }
    
    
    public User getUser(long id){
    
        return rUser.findById(id).orElse(null);
    }
    
    public void editUser(User user){
    
        rUser.save(user);
    }
    
    /*
    public User login(String email, String password){
       return rUser.findByEmailAndPassword(email, password);
        
    }
*/
}
