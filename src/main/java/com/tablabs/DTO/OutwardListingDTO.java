package com.tablabs.DTO;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class OutwardListingDTO {

	private String outwardNumber;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate outwardDate;
	private String letterType;
	private String letterNo;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate letterDate;
	private String outwardMode;

	public OutwardListingDTO() {
		super();
	}

	public OutwardListingDTO(String outwardNumber, LocalDate outwardDate, String letterType, String letterNo,
			LocalDate letterDate, String outwardMode) {
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

	public LocalDate getOutwardDate() {
		return outwardDate;
	}

	public void setOutwardDate(LocalDate outwardDate) {
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

	public LocalDate getLetterDate() {
		return letterDate;
	}

	public void setLetterDate(LocalDate letterDate) {
		this.letterDate = letterDate;
	}

	public String getOutwardMode() {
		return outwardMode;
	}

	public void setOutwardMode(String outwardMode) {
		this.outwardMode = outwardMode;
	}

}
