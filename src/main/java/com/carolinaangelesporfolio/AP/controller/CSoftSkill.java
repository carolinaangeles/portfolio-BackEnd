package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.SoftSkill;
import com.carolinaangelesporfolio.AP.service.SSoftSkill;
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
public class CSoftSkill {
   @Autowired
   SSoftSkill sSoftSkill;
   
   @GetMapping("/softskills")
   public List<SoftSkill> getSoftSkills(){
       return sSoftSkill.getSoftSkills();
   }
   
   @GetMapping("/softskill/{id}")
   public SoftSkill getSoftSkill(@PathVariable Long id){
       return sSoftSkill.getSoftSkill(id);
   }
   
   @PostMapping("/softskill/agregar")
   public void addSoftSkill (@RequestBody SoftSkill ss){
       sSoftSkill.addSoftSkill(ss);
   }
   
   @PutMapping("/softskill/editar")
   public void editSoftSkill(@RequestBody SoftSkill ss){
        sSoftSkill.editSoftSkill(ss);
   }
  
   @DeleteMapping("/softskill/eliminar/{id}")
   public void deleteSoftSkill (@PathVariable Long id){
       sSoftSkill.deleteSoftSkill(id);
   }
}
