package com.carolinaangelesporfolio.AP.repository;

import com.carolinaangelesporfolio.AP.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProject extends JpaRepository<Project, Long>{
}
