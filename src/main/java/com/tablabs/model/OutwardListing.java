package com.tablabs.model;

import java.util.Date;

public class OutwardListing {

	String outwardNumber;
	Date outwardDate;
	String letterType;
	String letterNumber;
	Date letterDate;
	String outwardMode;

	public OutwardListing() {
		super();
	}

	public OutwardListing(String outwardNumber, Date outwardDate, String letterType, String letterNumber,
			Date letterDate, String outwardMode) {
		super();
		this.outwardNumber = outwardNumber;
		this.outwardDate = outwardDate;
		this.letterType = letterType;
		this.letterNumber = letterNumber;
		this.letterDate = letterDate;
		this.outwardMode = outwardMode;
	}

	public String getOutwardNumber() {
		return outwardNumber;
	}

	public void setOutwardNumber(String outwardNumber) {
		this.outwardNumber = outwardNumber;
	}

	public Date getOutwardDate() {
		return outwardDate;
	}

	public void setOutwardDate(Date outwardDate) {
		this.outwardDate = outwardDate;
	}

	public String getLetterType() {
		return letterType;
	}

	public void setLetterType(String letterType) {
		this.letterType = letterType;
	}

	public String getLetterNumber() {
		return letterNumber;
	}

	public void setLetterNumber(String letterNumber) {
		this.letterNumber = letterNumber;
	}

	public Date getLetterDate() {
		return letterDate;
	}

	public void setLetterDate(Date letterDate) {
		this.letterDate = letterDate;
	}

	public String getOutwardMode() {
		return outwardMode;
	}

	public void setOutwardMode(String outwardMode) {
		this.outwardMode = outwardMode;
	}

}
