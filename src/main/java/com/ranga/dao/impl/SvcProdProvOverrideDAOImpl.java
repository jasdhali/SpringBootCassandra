/**
 * 
 */
package com.ranga.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ranga.dao.SvcProdProvOverrideDAO;
import com.ranga.entity.SvcProdProvOverride;
import com.ranga.entity.SvcProdProvOverrideId;
import com.ranga.util.MyCassandraTemplate;


@Repository
public class SvcProdProvOverrideDAOImpl implements SvcProdProvOverrideDAO {
    
    @Autowired
    private MyCassandraTemplate myCassandraTemplate;
    
       
    @Override
    public SvcProdProvOverride createEmployee(SvcProdProvOverride  svcProdProvOverride) {     
        return myCassandraTemplate.create( svcProdProvOverride );
    }
    
    
    @Override
    public SvcProdProvOverride getSvcProdProvOverride(String daccCd,int svcProdId) {
    	SvcProdProvOverrideId pk = new SvcProdProvOverrideId(daccCd,svcProdId);
        return myCassandraTemplate.findById( pk , SvcProdProvOverride.class);
    }
    

    @Override
    public SvcProdProvOverride updateSvcProdProvOverride(SvcProdProvOverride provOverride) {
        return myCassandraTemplate.update( provOverride, SvcProdProvOverride.class );
    }
	
    
    @Override
    public void deleteSvcProdProvOverride(String daccCd,int svcProdId) {
    	SvcProdProvOverrideId pk = new SvcProdProvOverrideId(daccCd,svcProdId);
        myCassandraTemplate.deleteById( pk , SvcProdProvOverride.class );
    }
    
    @Override
    public List<SvcProdProvOverride> getAllSvcProdProvOverrides() {       
        return myCassandraTemplate.findAll(SvcProdProvOverride.class);
    }

	/*@Override
	public SvcProdProvOverride getSvcProdProvOverride(String daccCode, int svcProdId) {
		
		return myCassandraTemplate.findById(id, claz);
	}*/
}