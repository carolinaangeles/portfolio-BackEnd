package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.Experience;
import com.carolinaangelesporfolio.AP.entity.Project;
import com.carolinaangelesporfolio.AP.service.SExperience;
import com.carolinaangelesporfolio.AP.service.SProject;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://carolina-angeles.web.app")
public class CProject {
   @Autowired
   SProject sProject;
   
   @GetMapping("/proyectos")
   public List<Project> getProjects(){
       return sProject.getProjects();
   }
   
   @GetMapping("/proyecto/{id}")
   public Project getProject(@PathVariable Long id){
       return sProject.getProject(id);
   }
   
   @PostMapping("/proyecto/agregar")
   public void addProject(@RequestBody Project p){
       sProject.addProject(p);
   }
   
   @PutMapping("/proyecto/editar")
   public void editProject(@RequestBody Project p){
        sProject.editProject(p);
   }
   
   @DeleteMapping("/proyecto/eliminar/{id}")
   public void deleteProject(@PathVariable Long id){
       sProject.deleteProject(id);
   }
}
