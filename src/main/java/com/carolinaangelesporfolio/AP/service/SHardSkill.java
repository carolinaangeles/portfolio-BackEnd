package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.HardSkill;
import com.carolinaangelesporfolio.AP.repository.RHardSkill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHardSkill {
    @Autowired 
    private RHardSkill rHardSkill;

    public List<HardSkill> getHardSkills(){
        List <HardSkill>hs= rHardSkill.findAll();
        return hs;
    }
    
    public HardSkill getHardSkill(Long id) {
        HardSkill hs = rHardSkill.findById(id).orElse(null);
        return hs;
    }

    public void addHardSkill(HardSkill hs) {
       rHardSkill.save(hs);    
    }
    
    public void editHardSkill(HardSkill hs) {
       rHardSkill.save(hs);    
    }
    
    public void deleteHardSkill(Long id) {
        rHardSkill.deleteById(id);
    }
}
