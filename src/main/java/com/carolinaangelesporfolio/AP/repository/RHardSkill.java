package com.carolinaangelesporfolio.AP.repository;

import com.carolinaangelesporfolio.AP.entity.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHardSkill extends JpaRepository<HardSkill, Long>{
    
}
