package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.SocialMedia;
import com.carolinaangelesporfolio.AP.repository.RSocialMedia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSocialMedia {
    @Autowired 
    private RSocialMedia rSocialMedia;

    public List<SocialMedia> getAllSocialMedia(){
        List <SocialMedia> sm= rSocialMedia.findAll();
        return sm;
    }
    
    public SocialMedia getSocialMedia(Long id) {
        SocialMedia sm = rSocialMedia.findById(id).orElse(null);
        return sm;
    }

    public void addSocialMedia(SocialMedia sm) {
       rSocialMedia.save(sm);    
    }
    
    public void editSocialMedia(SocialMedia sm) {
       rSocialMedia.save(sm);    
    }
    
    public void deleteSocialMedia(Long id) {
        rSocialMedia.deleteById(id);
    }
    
}
