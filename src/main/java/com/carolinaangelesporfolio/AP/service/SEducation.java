/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.Education;
import com.carolinaangelesporfolio.AP.repository.REducation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author usuario
 */
public class SEducation {
    
    @Autowired //este servicio se relaciona con el repo de experiencia
    REducation rEducation; //se reescribe lo q se trae de repo experiencia (Metodos JPA)

    public List<Education> getEducations(){
        List <Education>listEducations=rEducation.findAll(); //metodos JPA, de extends...
        return listEducations;
    }

    //este tmb sirve para editar
    public void addEducation (Education ed) {
       rEducation.save(ed);    
    }
    
    public void editEducation (Education ed) {
       rEducation.save(ed);    
    }
    
    public void deleteEducation(Long id) {
        rEducation.deleteById(id);
    }
    
    public Education findEducation(Long id) {
        Education ed = rEducation.findById(id).orElse(null);
        return ed;
    }
    
}
