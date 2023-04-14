package com.carolinaangelesporfolio.AP.service;

//ctrl + shift + i
import com.carolinaangelesporfolio.AP.entity.Experience;
import com.carolinaangelesporfolio.AP.repository.RExperience;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional //para la persistencia de datos
public class SExperience {
    
    //quedate solo con lo que  usas
    @Autowired //este servicio se relaciona con el repo de experiencia
    RExperience rExperience; //se reescribe lo q se trae de repo experiencia (Metodos JPA)

    public List<Experience> getExperiences(){
        List <Experience>listExperiences=rExperience.findAll(); //metodos JPA, de extends...
        return listExperiences;
    }

    //este tmb sirve para editar
    public void addExperience (Experience exp) {
       rExperience.save(exp);    
    }
    
    public void editExperience (Experience exp) {
       rExperience.save(exp);    
    }
    
    public void deleteExperience(Long id) {
        rExperience.deleteById(id);
    }
    
    public Experience findExperience(Long id) {
        Experience exp = rExperience.findById(id).orElse(null);
        return exp;
    }
    
}