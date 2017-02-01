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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((daccCode == null) ? 0 : daccCode.hashCode());
		result = prime * result + ((svcProdId == null) ? 0 : svcProdId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SvcProdProvOverrideId other = (SvcProdProvOverrideId) obj;
		if (daccCode == null) {
			if (other.daccCode != null)
				return false;
		} else if (!daccCode.equals(other.daccCode))
			return false;
		if (svcProdId == null) {
			if (other.svcProdId != null)
				return false;
		} else if (!svcProdId.equals(other.svcProdId))
			return false;
		return true;
	}
	
}
