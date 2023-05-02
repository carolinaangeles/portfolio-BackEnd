package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.Education;
import com.carolinaangelesporfolio.AP.service.SEducation;
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
@RequestMapping("education") //ruta experience localhost:8080/experience
@CrossOrigin(origins = "localhost:4200") //se relaciona con esta pagina
public class CEducation {
    
     //usa los metodos del servicio
   @Autowired
   SEducation sEducation;
   
   @GetMapping("/lista")
   @ResponseBody
   public List<Education> allEducations(){
       return sEducation.getEducations();
   }
   
   @GetMapping("/detalles/{id}")
   @ResponseBody
   public Education userEducation(@PathVariable Long id){
       return sEducation.findEducation(id);
   }
   
   //podes hacer este metodo void
   @PostMapping("/agregar")
   public String addEducation (@RequestBody Education exp){
       sEducation.addEducation(exp);
       return "Added successfully.";
   }
   
   @PutMapping("/editar")
   public String editEducation (@RequestBody Education exp){
       sEducation.editEducation(exp);
       return "Edited successfully.";
   }
   
   @DeleteMapping("/eliminar/{id}")
   public String deleteEducation (@PathVariable Long id){
       sEducation.deleteEducation(id);
       return "Added successfully.";
   }
    
}
