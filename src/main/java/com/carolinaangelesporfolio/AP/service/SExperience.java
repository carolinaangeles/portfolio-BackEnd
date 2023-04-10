package com.carolinaangelesporfolio.AP.service;

//ctrl + shift + i
import com.carolinaangelesporfolio.AP.repository.RExperience;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional //para la persistencia de datos
public class SExperience {
    
    @Autowired
    RExperience rExperience; //se reescribe lo q se trae de repo experiencia (Metodos JPA)
    
    //Nombramos los metodos nomas en el servicio quedate solo con lo que  usas

    //falta copiar los metodos xd
}
