package com.tablabs.DTO;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class OutwardEntryDTO {

	private String outwardNo;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate outwardDate;

	private String letterType;
	private String inwardLetterNo;
	private String whomToSend;
	private String fromBranchOrUnit;
	private String outwardMode;
	private double amount;
	private String remark;

	public OutwardEntryDTO() {
		super();
	}

	public OutwardEntryDTO(String outwardNo, LocalDate outwardDate, String letterType, String inwardLetterNo,
			String whomToSend, String fromBranchOrUnit, String outwardMode, double amount, String remark) {
		super();
		this.outwardNo = outwardNo;
		this.outwardDate = outwardDate;
		this.letterType = letterType;
		this.inwardLetterNo = inwardLetterNo;
		this.whomToSend = whomToSend;
		this.fromBranchOrUnit = fromBranchOrUnit;
		this.outwardMode = outwardMode;
		this.amount = amount;
		this.remark = remark;
	}

	public String getOutwardNo() {
		return outwardNo;
	}

	public void setOutwardNo(String outwardNo) {
		this.outwardNo = outwardNo;
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

	public String getInwardLetterNo() {
		return inwardLetterNo;
	}

	public void setInwardLetterNo(String inwardLetterNo) {
		this.inwardLetterNo = inwardLetterNo;
	}

	public String getWhomToSend() {
		return whomToSend;
	}

	public void setWhomToSend(String whomToSend) {
		this.whomToSend = whomToSend;
	}

	public String getFromBranchOrUnit() {
		return fromBranchOrUnit;
	}

	public void setFromBranchOrUnit(String fromBranchOrUnit) {
		this.fromBranchOrUnit = fromBranchOrUnit;
	}

	public String getOutwardMode() {
		return outwardMode;
	}

	public void setOutwardMode(String outwardMode) {
		this.outwardMode = outwardMode;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
