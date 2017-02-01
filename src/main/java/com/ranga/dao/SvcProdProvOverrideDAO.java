package com.ranga.dao;

import java.util.List;

import com.ranga.entity.SvcProdProvOverride;


public interface SvcProdProvOverrideDAO {
    /**
     * Used to Create the Employee Information
     * @param employee
     * @return {@link Employee}
    */
    
	public SvcProdProvOverride createEmployee(SvcProdProvOverride  svcProdProvOverride);
    
    /**
     * Getting the Employee Information using Id
     * @param id
     * @return {@link Employee}
    */
    public SvcProdProvOverride getSvcProdProvOverride(String daccCode,int svcProdId);
    
    /**
     * Used to Update the Employee Information
     * @param employee
     * @return {@link Employee}
     */
    //public Employee updateEmployee(Employee employee);
    public SvcProdProvOverride updateSvcProdProvOverride(SvcProdProvOverride provOverride);
    /**
     * Deleting the Employee Information using Id
     * @param id
    */
    
    public void deleteSvcProdProvOverride(String daccCd,int svcProdId);

    
    /**
     * Getting the All Employees information
     * @return
    */
    public List<SvcProdProvOverride> getAllSvcProdProvOverrides();
}