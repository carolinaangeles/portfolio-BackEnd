
package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.SoftSkill;
import com.carolinaangelesporfolio.AP.repository.RSoftSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSoftSkill {
    @Autowired 
    private RSoftSkill rSoftSkill;

    public List<SoftSkill> getSoftSkills(){
        List <SoftSkill>ss= rSoftSkill.findAll();
        return ss;
    }
    
    public SoftSkill getSoftSkill(Long id) {
        SoftSkill ss = rSoftSkill.findById(id).orElse(null);
        return ss;
    }

    public void addSoftSkill(SoftSkill ss) {
       rSoftSkill.save(ss);    
    }
    
    public void editSoftSkill(SoftSkill ss) {
       rSoftSkill.save(ss);    
    }
    
    public void deleteSoftSkill(Long id) {
        rSoftSkill.deleteById(id);
    }
}
