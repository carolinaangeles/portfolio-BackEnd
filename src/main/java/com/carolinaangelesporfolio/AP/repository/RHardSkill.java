package com.carolinaangelesporfolio.AP.repository;

import com.carolinaangelesporfolio.AP.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHardSkill extends JpaRepository<Experience, Long>{
    
}
