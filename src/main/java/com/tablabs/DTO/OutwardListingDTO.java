package com.tablabs.DTO;

import java.util.Date;

public class OutwardListingDTO {

	private String outwardNumber;
	private Date outwardDate;
	private String letterType;
	private String letterNo;
	private Date letterDate;
	private String outwardMode;

	public OutwardListingDTO() {
		super();
	}

	public OutwardListingDTO(String outwardNumber, Date outwardDate, String letterType, String letterNo,
			Date letterDate, String outwardMode) {
		super();
		this.outwardNumber = outwardNumber;
		this.outwardDate = outwardDate;
		this.letterType = letterType;
		this.letterNo = letterNo;
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

	public String getLetterNo() {
		return letterNo;
	}

	public void setLetterNo(String letterNo) {
		this.letterNo = letterNo;
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
