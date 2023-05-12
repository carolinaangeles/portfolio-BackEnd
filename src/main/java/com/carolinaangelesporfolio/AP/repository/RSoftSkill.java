package com.carolinaangelesporfolio.AP.repository;

import com.carolinaangelesporfolio.AP.entity.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSoftSkill extends JpaRepository<SoftSkill, Long>{
    
}
