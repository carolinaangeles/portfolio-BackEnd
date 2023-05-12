package com.carolinaangelesporfolio.AP.repository;

import com.carolinaangelesporfolio.AP.entity.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSocialMedia extends JpaRepository<SocialMedia, Long>{
    
}
