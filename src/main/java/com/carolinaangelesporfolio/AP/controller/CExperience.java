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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experience") //ruta experience localhost:8080/experience
@CrossOrigin(origins = "localhost:4200") //se relaciona con esta pagina
public class CExperience{
    
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
   
   
   
}
