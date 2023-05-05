package com.carolinaangelesporfolio.AP.service;

import com.carolinaangelesporfolio.AP.entity.Education;
import java.util.List;

public interface ISEducation {
    
    public List<Education> getEducations();
    
    public Education getEducation(Long id);
    
    public void addEducation(Education ed);
    
    public void editEducation(Education ed);
    
    public void deleteEducation(Long id);
    
}
