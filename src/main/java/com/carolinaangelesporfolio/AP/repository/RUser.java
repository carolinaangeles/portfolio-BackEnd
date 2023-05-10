package com.carolinaangelesporfolio.AP.repository;

import com.carolinaangelesporfolio.AP.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUser extends JpaRepository <User, Long> {
    
    public User findByEmailAndPassword(String email, String password);
}
