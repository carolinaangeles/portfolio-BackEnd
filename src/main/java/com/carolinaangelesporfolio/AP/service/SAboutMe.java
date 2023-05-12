package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.AboutMe;
import com.carolinaangelesporfolio.AP.repository.RAboutMe;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAboutMe {
    
    @Autowired 
    private RAboutMe rAboutMe;

    public List<AboutMe> getAboutMe(){
        List <AboutMe>aboutMe=rAboutMe.findAll();
        return aboutMe;
    }

    public void addAboutMe(AboutMe ab) {
       rAboutMe.save(ab);    
    }
    
    public void editAboutMe(AboutMe ab) {
       rAboutMe.save(ab);    
    }
    
}
