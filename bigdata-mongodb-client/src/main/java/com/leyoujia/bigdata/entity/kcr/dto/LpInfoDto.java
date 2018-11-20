package com.leyoujia.bigdata.entity.kcr.dto;

import java.io.Serializable;

public class LpInfoDto  implements Serializable{
	private String lpId;
	private String lpName;
	
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	public String getLpName() {
		return lpName;
	}
	public void setLpName(String lpName) {
		this.lpName = lpName;
	}
}
