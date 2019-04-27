package com.cust.pi.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerVo {

	private String custName;
	
	private String moblieNumber;
	
	private String port;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMoblieNumber() {
		return moblieNumber;
	}

	public void setMoblieNumber(String moblieNumber) {
		this.moblieNumber = moblieNumber;
	}
	

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "CustomerVo [custName=" + custName + ", moblieNumber=" + moblieNumber + ", port=" + port + "]";
	}

	
	
}
