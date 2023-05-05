package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.Education;
import com.carolinaangelesporfolio.AP.repository.REducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SEducation implements ISEducation{
    
    @Autowired 
    private REducation rEducation;

    @Override
    public List<Education> getEducations(){
        List <Education>listEducations=rEducation.findAll(); //metodos JPA, de extends...
        return listEducations;
    }
    
    @Override
    public Education getEducation(Long id) {
        Education ed = rEducation.findById(id).orElse(null);
        return ed;
    }

    @Override
    public void addEducation (Education ed) {
       rEducation.save(ed);    
    }
    
    @Override
    public void editEducation (Education ed) {
       rEducation.save(ed);    
    }
    
    @Override
    public void deleteEducation(Long id) {
        rEducation.deleteById(id);
    }
    
}
