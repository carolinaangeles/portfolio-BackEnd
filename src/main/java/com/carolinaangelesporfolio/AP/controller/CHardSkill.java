
package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.HardSkill;
import com.carolinaangelesporfolio.AP.service.SHardSkill;
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
public class CHardSkill {
   @Autowired
   SHardSkill sHardSkill;
   
   @GetMapping("/hardskills")
   public List<HardSkill> getHardSkills(){
       return sHardSkill.getHardSkills();
   }
   
   @GetMapping("/hardskill/{id}")
   public HardSkill getHardSkill(@PathVariable Long id){
       return sHardSkill.getHardSkill(id);
   }
   
   @PostMapping("/hardskill/agregar")
   public void addHardSkill (@RequestBody HardSkill hs){
       sHardSkill.addHardSkill(hs);
   }
   
   @PutMapping("/hardskill/editar")
   public void editHardSkill(@RequestBody HardSkill hs){
        sHardSkill.editHardSkill(hs);
   }
  
   @DeleteMapping("/hardskill/eliminar/{id}")
   public void deleteExperience (@PathVariable Long id){
       sHardSkill.deleteHardSkill(id);
   }
}
