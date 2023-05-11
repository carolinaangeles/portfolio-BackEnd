package com.carolinaangelesporfolio.AP.service;

//ctrl + shift + i
import com.carolinaangelesporfolio.AP.entity.Education;
import com.carolinaangelesporfolio.AP.entity.Experience;
import com.carolinaangelesporfolio.AP.repository.RExperience;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional //para la persistencia de datos
public class SExperience{
    
    @Autowired 
    private RExperience rExperience;

    public List<Experience> getExperiences(){
        List <Experience>listExperiences=rExperience.findAll(); //metodos JPA, de extends...
        return listExperiences;
    }
    
    public Experience getExperience(Long id) {
        Experience exp= rExperience.findById(id).orElse(null);
        return exp;
    }

    public void addExperience (Experience exp) {
       rExperience.save(exp);    
    }
    
    public void editExperience (Experience exp) {
       rExperience.save(exp);    
    }
    
    public void deleteExperience(Long id) {
        rExperience.deleteById(id);
    }

    
}