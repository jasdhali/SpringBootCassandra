package com.ranga.entity;

import java.io.Serializable;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

//@IdClass(SvcProdProvOverrideId.class)
@Table("SVC_PROD_PROV_OVERRIDE")
public class SvcProdProvOverride implements Serializable{
	
	//private String svcProdProvCode;
/*	@EmbeddedId
	private SvcProdProvOverrideId id;*/
	
	/*@PrimaryKeyColumn(name="SVC_PROD_ID",ordinal=1,type=PrimaryKeyType.PARTITIONED)
	private String svcProdId;

	@PrimaryKeyColumn(name="DACC_CD",ordinal=1,type=PrimaryKeyType.PARTITIONED)
	private String daccCode;*/
	
	@PrimaryKey
	private SvcProdProvOverrideId id;
	
	@Column("PROV_TYP_CD")   
	private String provTypeCode;
	
	@Column("OVR_SVC_PROD_PROV_CD")
	private String overServiceProdProvCode;
	
	@Column("DACC_RA_GRP_CD")
	private String daccRaGroupdCode;
	
	
	//private String DB_USERID;
	//private String DB_TMSTAMP;
	@Column("OVR_PROV_TYP_CD")
	private String overProvTypeCode;

	public SvcProdProvOverride() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getProvTypeCode() {
		return provTypeCode;
	}

	public void setProvTypeCode(String provTypeCode) {
		this.provTypeCode = provTypeCode;
	}

	public String getOverServiceProdProvCode() {
		return overServiceProdProvCode;
	}

	public void setOverServiceProdProvCode(String overServiceProdProvCode) {
		this.overServiceProdProvCode = overServiceProdProvCode;
	}

	public String getDaccRaGroupdCode() {
		return daccRaGroupdCode;
	}

	public void setDaccRaGroupdCode(String daccRaGroupdCode) {
		this.daccRaGroupdCode = daccRaGroupdCode;
	}



	public String getOverProvTypeCode() {
		return overProvTypeCode;
	}

	public void setOverProvTypeCode(String overProvTypeCode) {
		this.overProvTypeCode = overProvTypeCode;
	}



	public SvcProdProvOverrideId getId() {
		return id;
	}



	public void setId(SvcProdProvOverrideId id) {
		this.id = id;
	}



	public SvcProdProvOverride(SvcProdProvOverrideId id) {
		super();
		this.id = id;
	}
	
}
