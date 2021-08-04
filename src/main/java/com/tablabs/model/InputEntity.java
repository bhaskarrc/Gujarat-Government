package com.tablabs.model;

import java.util.Date;

public class InputEntity {
	int serialNumber;
	String letterNumber;
	Date date;
	String fromEntity;
	String toUnit;

	public InputEntity() {
		super();
	}

	public InputEntity(int serialNumber, String letterNumber, Date date, String fromEntity, String toUnit) {
		super();
		this.serialNumber = serialNumber;
		this.letterNumber = letterNumber;
		this.date = date;
		this.fromEntity = fromEntity;
		this.toUnit = toUnit;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getLetterNumber() {
		return letterNumber;
	}

	public void setLetterNumber(String letterNumber) {
		this.letterNumber = letterNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFromEntity() {
		return fromEntity;
	}

	public void setFromEntity(String fromEntity) {
		this.fromEntity = fromEntity;
	}

	public String getToUnit() {
		return toUnit;
	}

	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}

}
