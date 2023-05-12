
package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.AboutMe;
import com.carolinaangelesporfolio.AP.service.SAboutMe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://carolina-angeles.web.app")
public class CAboutMe {
   @Autowired
   SAboutMe sAboutMe;
   
   @GetMapping("/acerca-de-mi")
   public List<AboutMe> getAboutMe(){
       return sAboutMe.getAboutMe();
   }
   
   @PostMapping("/acerca-de-mi/agregar")
   public void addAboutMe(@RequestBody AboutMe ab){
       sAboutMe.addAboutMe(ab);
   }
   
   @PutMapping("/acerca-de-mi/editar")
   public void editAboutMe(@RequestBody AboutMe ab){
        sAboutMe.editAboutMe(ab);
   }
  
}
