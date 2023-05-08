package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.Education;
import com.carolinaangelesporfolio.AP.service.ISEducation;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("estudio") 
@CrossOrigin(origins = "http://localhost:8080/") //se relaciona con esta pagina
public class CEducation {
    
   @Autowired
   ISEducation interfaceSEducation;
   
   @GetMapping("/estudios")
   //@ResponseBody
   public List<Education> getEducations(){
       return interfaceSEducation.getEducations();
   }
   
   @GetMapping("/estudio/{id}") //link = endpoint
   //@ResponseBody
   public Education getEducation(@PathVariable Long id){
       return interfaceSEducation.getEducation(id);
   }
   
   @PostMapping("/estudio/agregar")
   public void addEducation (@RequestBody Education ed){
       interfaceSEducation.addEducation(ed);
   }
   
   @PutMapping("/estudio/editar")
   public void editarPersona(@RequestBody Education ed){
        interfaceSEducation.editEducation(ed);
   }
   
   /*
   @PutMapping("/estudio/editar/{id}")
   public Education editEducation (@PathVariable Long id,
                                @RequestParam("titulo") String newTitle,
                                @RequestParam("institucion") String newInstitution,
                                @RequestParam("inicio") String newStartDate,
                                @RequestParam("finalizacion") String newEndDate,
                                @RequestParam("url") String newUrl){ //@RequestBody Education exp
       //interfaceSEducation.editEducation(exp);
       Education ed= interfaceSEducation.getEducation(id);
       //esto puede ir en un nuevo metodo en service para desacoplar
       ed.setTitle(newTitle);
       ed.setInstitution(newInstitution);
       ed.setStartDate(newStartDate);
       ed.setEndDate(newEndDate);
       ed.setUrl(newUrl);
       interfaceSEducation.editEducation(ed);
       return ed;
   }
   */
   
   @DeleteMapping("/estudio/eliminar/{id}")
   public void deleteEducation (@PathVariable Long id){
       interfaceSEducation.deleteEducation(id);
   }
    
}
