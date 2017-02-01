package com.ranga.service;

import java.util.List;

import com.ranga.entity.SvcProdProvOverride;


public interface SvcProdProvOverrideService {
    /**
     * Used to Create the Employee Information
     * @param employee
     * @return {@link Employee}
     */
    public SvcProdProvOverride createSvcProdProvOverrideService(SvcProdProvOverride svcProdProvOverride);
    
    /**
     * Getting the Employee Information using Id
     * @param id
     * @return {@link Employee}
     */
    public SvcProdProvOverride getSvcProdProvOverrideService(String daccCd,Integer svcProdId);
    
    /**
     * Used to Update the Employee Information
     * @param employee
     * @return {@link Employee}
     */
    public SvcProdProvOverride updateEmployee(SvcProdProvOverride svcProdProvOverride);
    
    /**
     * Deleting the Employee Information using Id
     * @param id
     */
    public void deleteSvcProdProvOverride(String daccCd,Integer svcProdId);
    /**
     * Getting the All Employees information
     * @return
     */
    public List<SvcProdProvOverride> getAllSvcProdProvOverrides();
}