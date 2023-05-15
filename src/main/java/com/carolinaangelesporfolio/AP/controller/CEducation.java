package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.Education;
import com.carolinaangelesporfolio.AP.service.ISEducation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://carolina-angeles.web.app"})
public class CEducation {
    
   @Autowired
   ISEducation interfaceSEducation;
   
   @GetMapping("/estudios")
   public List<Education> getEducations(){
       return interfaceSEducation.getEducations();
   }
   
   @GetMapping("/estudio/{id}") 
   public Education getEducation(@PathVariable Long id){
       return interfaceSEducation.getEducation(id);
   }
   
   @PostMapping("/estudio/agregar")
   public void addEducation (@RequestBody Education ed){
       interfaceSEducation.addEducation(ed);
   }
   
   
   @PutMapping("/estudio/editar")
   public void editEducation(@RequestBody Education ed){
        interfaceSEducation.editEducation(ed);
   }
   
   @DeleteMapping("/estudio/eliminar/{id}")
   public void deleteEducation (@PathVariable Long id){
       interfaceSEducation.deleteEducation(id);
   }
    
}