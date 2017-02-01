package com.ranga.entity;

import java.io.Serializable;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;

//@Table("SVC_PROD_PROV_OVERRIDE")
//@Embeddable
//@Access (AccessType.FIELD)
@PrimaryKeyClass 
public class SvcProdProvOverrideId implements Serializable{

	@PrimaryKeyColumn(name="SVC_PROD_ID",ordinal=1,type=PrimaryKeyType.PARTITIONED)
	private Integer svcProdId;

	@PrimaryKeyColumn(name="DACC_CD",ordinal=1,type=PrimaryKeyType.PARTITIONED)
	private String daccCode;

	public SvcProdProvOverrideId(String daccCode, Integer svcProdId) {
		super();
		this.daccCode = daccCode;
		this.svcProdId = svcProdId;
	}

	public SvcProdProvOverrideId() {
		super();
	}

	public String getDaccCode() {
		return daccCode;
	}

	public void setDaccCode(String daccCode) {
		this.daccCode = daccCode;
	}

	public Integer getSvcProdId() {
		return svcProdId;
	}

	public void setSvcProdId(Integer svcProdId) {
		this.svcProdId = svcProdId;
	}

}
