package com.tablabs.model;

import java.util.Date;

public class OutputEntity {
	int serialNumber;
	Date date;
	String toEntity;
	String fromUnit;
	String sendingMode;

	public OutputEntity() {
		super();
	}

	public OutputEntity(int serialNumber, Date date, String toEntity, String fromUnit, String sendingMode) {
		super();
		this.serialNumber = serialNumber;
		this.date = date;
		this.toEntity = toEntity;
		this.fromUnit = fromUnit;
		this.sendingMode = sendingMode;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getToEntity() {
		return toEntity;
	}

	public void setToEntity(String toEntity) {
		this.toEntity = toEntity;
	}

	public String getFromUnit() {
		return fromUnit;
	}

	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}

	public String getSendingMode() {
		return sendingMode;
	}

	public void setSendingMode(String sendingMode) {
		this.sendingMode = sendingMode;
	}

}
