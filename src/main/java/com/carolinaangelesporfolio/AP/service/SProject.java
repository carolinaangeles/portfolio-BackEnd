package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.HardSkill;
import com.carolinaangelesporfolio.AP.entity.Project;
import com.carolinaangelesporfolio.AP.repository.RHardSkill;
import com.carolinaangelesporfolio.AP.repository.RProject;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProject {
    @Autowired 
    private RProject rProject;

    public List<Project> getProjects(){
        List <Project>projects= rProject.findAll();
        return projects;
    }
    
    public Project getProject(Long id) {
        Project p = rProject.findById(id).orElse(null);
        return p;
    }

    public void addProject(Project p) {
       rProject.save(p);    
    }
    
    public void editProject(Project p) {
       rProject.save(p);    
    }
    
    public void deleteProject(Long id) {
        rProject.deleteById(id);
    }
}
