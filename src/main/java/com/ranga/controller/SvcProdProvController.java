package com.ranga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ranga.entity.SvcProdProvOverride;
import com.ranga.service.SvcProdProvOverrideService;

@RestController
public class SvcProdProvController {

	@Autowired
	private SvcProdProvOverrideService prodProvOverrideService;

	public SvcProdProvController() {
		System.out.println("SvcProdProvController()");
	}

	@RequestMapping(value = "/serviceProducts", method = RequestMethod.POST)
	SvcProdProvOverride create(@RequestBody SvcProdProvOverride svcProdProvOverride) {
		return prodProvOverrideService.createSvcProdProvOverrideService(svcProdProvOverride);
	}

	@RequestMapping(value = "/serviceProducts/{daccCode}/{svcProdId}", method = RequestMethod.DELETE)
	void delete(@PathVariable("daccCode") String daccCode, @PathVariable("svcProdId") int svcProdId) {
		prodProvOverrideService.deleteSvcProdProvOverride(daccCode, svcProdId);
	}

	@RequestMapping(value = "/serviceProducts", method = RequestMethod.GET)
	List<SvcProdProvOverride> findAll() {
		return prodProvOverrideService.getAllSvcProdProvOverrides();
	}

	@RequestMapping(value = "/serviceProducts/{daccCode}/{svcProdId}", method = RequestMethod.GET)
	SvcProdProvOverride findById(@PathVariable("daccCode") String daccCode, @PathVariable("svcProdId") int svcProdId) {
		return prodProvOverrideService.getSvcProdProvOverrideService(daccCode, svcProdId);
	}

	
	 @RequestMapping(value = "/serviceProducts" , method = RequestMethod.PUT) 
	 SvcProdProvOverride update(@RequestBody SvcProdProvOverride employee) { 
		 return prodProvOverrideService.updateEmployee(employee); 
	 }
	 
}