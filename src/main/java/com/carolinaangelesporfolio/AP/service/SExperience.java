package com.carolinaangelesporfolio.AP.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional //para la persistencia de datos
public class SExperience {
    
    @Autowired
    RExperience rExperience; //se reescribe lo q se trae de repo experiencia
    
}
