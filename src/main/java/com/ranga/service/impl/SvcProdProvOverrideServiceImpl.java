package com.ranga.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ranga.dao.SvcProdProvOverrideDAO;
import com.ranga.entity.SvcProdProvOverride;
import com.ranga.service.SvcProdProvOverrideService;


@Service
public class SvcProdProvOverrideServiceImpl implements SvcProdProvOverrideService{

    @Autowired  
    private SvcProdProvOverrideDAO svcProdProvOverrideDAO;

    /**
     * Default Constructor
     */
    public SvcProdProvOverrideServiceImpl() {
        super();    
    }

/*  @Override   
    public Employee createEmployee(Employee employee) {     
        return employeeDAO.createEmployee(employee);
    }
*/
    @Override
    public SvcProdProvOverride createSvcProdProvOverrideService(SvcProdProvOverride svcProdProvOverride){
    	return svcProdProvOverrideDAO.createEmployee( svcProdProvOverride );
    }

    @Override   
    public SvcProdProvOverride getSvcProdProvOverrideService(String daccCd,Integer svcProdId) {       
        return svcProdProvOverrideDAO.getSvcProdProvOverride( daccCd, svcProdId );
    }

/*  
    @Override   
    public Employee updateEmployee(Employee employee) {     
        return employeeDAO.updateEmployee(employee);
    }
*/
    public SvcProdProvOverride updateEmployee(SvcProdProvOverride svcProdProvOverride) {
    	return svcProdProvOverrideDAO.updateSvcProdProvOverride( svcProdProvOverride );
    }

    @Override   
    public void deleteSvcProdProvOverride(String daccCd,Integer svcProdId) {  
        svcProdProvOverrideDAO.deleteSvcProdProvOverride( daccCd, svcProdId );
        //employeeDAO.deleteEmployee( id );
    }

    @Override   
    public List<SvcProdProvOverride>  getAllSvcProdProvOverrides() {       
        return svcProdProvOverrideDAO.getAllSvcProdProvOverrides();
    }
}