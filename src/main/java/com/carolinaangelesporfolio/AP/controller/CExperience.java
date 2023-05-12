package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.Experience;
import com.carolinaangelesporfolio.AP.service.SExperience;
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
public class CExperience{
    
        
   @Autowired
   SExperience sExperience;
   
   @GetMapping("/experiencias")
   public List<Experience> getExperiences(){
       return sExperience.getExperiences();
   }
   
   @GetMapping("/experiencia/{id}") //link = endpoint
   public Experience getExperience(@PathVariable Long id){
       return sExperience.getExperience(id);
   }
   
   @PostMapping("/experiencia/agregar")
   public void addExperience (@RequestBody Experience exp){
       sExperience.addExperience(exp);
   }
   
   @PutMapping("/experiencia/editar")
   public void editExperience(@RequestBody Experience exp){
        sExperience.editExperience(exp);
   }
   
   @DeleteMapping("/experiencia/eliminar/{id}")
   public void deleteExperience (@PathVariable Long id){
       sExperience.deleteExperience(id);
   }
   
   /*
   @PutMapping("estudio/editar")
    public void editar(@RequestBody Education ed ){
        
       Education edEdit= interfaceSEducation.getEducation( ed.getId() );
       
       edEdit.setTitle( ed.getTitle() );
       edEdit.setInstitution( ed.getInstitution() );
       edEdit.setStartDate( ed.getStartDate() );
       edEdit.setEndDate( ed.getEndDate() );
       edEdit.setUrl( ed.getUrl() );
        
       interfaceSEducation.editEducation(edEdit);
    }
   */
   
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
   
  
    
    /*
    //usa los metodos del servicio
   @Autowired
   SExperience sExperience;
   
   @GetMapping("/experiences")
   @ResponseBody
   public List<Experience> getExperiences(){
       return sExperience.getExperiences();
   }
   
   @GetMapping("/get/{id}")
   @ResponseBody
   public Experience getExperience(@PathVariable Long id){
       return sExperience.findExperience(id);
   }
   
   //podes hacer este metodo void
   @PostMapping("/add")
   public String addExperience (@RequestBody Experience exp){
       sExperience.addExperience(exp);
       return "Added successfully.";
   }
   
   @PutMapping("/edit")
   public String editExperience (@RequestBody Experience exp){
       sExperience.editExperience(exp);
       return "Edited successfully.";
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteExperience (@PathVariable Long id){
       sExperience.deleteExperience(id);
       return "Added successfully.";
   }
   
   */
   
}
