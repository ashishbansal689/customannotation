package com.threadminions.model;

import org.springframework.stereotype.Component;

import com.threadminions.annotations.SupportedValues;

@Component
public class ConfigProp {

	@SupportedValues(message = "Invalid values found for dbType", values = {"ORACLE", "MYSQL", "SQL"})
	private String dbType;

	public String getDbType() {
		return dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}
}
