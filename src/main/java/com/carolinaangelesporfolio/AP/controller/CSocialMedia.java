package com.carolinaangelesporfolio.AP.controller;

import com.carolinaangelesporfolio.AP.entity.SocialMedia;
import com.carolinaangelesporfolio.AP.service.SSocialMedia;
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
@CrossOrigin(origins = {"https://carolina-angeles.web.app"})
public class CSocialMedia {
   @Autowired
   SSocialMedia sSocialMedia;
   
   @GetMapping("/redes-sociales")
   public List<SocialMedia> getAllSocialMedia(){
       return sSocialMedia.getAllSocialMedia();
   }
   
   @GetMapping("/redes-social/{id}")
   public SocialMedia getSocialMedia(@PathVariable Long id){
       return sSocialMedia.getSocialMedia(id);
   }
   
   @PostMapping("/redes-social/agregar")
   public void addSocialMedia(@RequestBody SocialMedia sm){
       sSocialMedia.addSocialMedia(sm);
   }
   
   @PutMapping("/redes-social/editar")
   public void editSocialMedia(@RequestBody SocialMedia sm){
        sSocialMedia.editSocialMedia(sm);
   }
   
   @DeleteMapping("/redes-social/eliminar/{id}")
   public void deleteSocialMedia(@PathVariable Long id){
       sSocialMedia.deleteSocialMedia(id);
   }
}
