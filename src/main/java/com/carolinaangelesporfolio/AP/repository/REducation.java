package com.carolinaangelesporfolio.AP.repository;

import com.carolinaangelesporfolio.AP.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducation extends JpaRepository<Education, Long>{
}
