package com.carolinaangelesporfolio.AP.repository;

import com.carolinaangelesporfolio.AP.entity.AboutMe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAboutMe extends JpaRepository<AboutMe, Long>{
    
}
