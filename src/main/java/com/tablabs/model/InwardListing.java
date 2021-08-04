package com.tablabs.model;

import java.util.Date;

public class InwardListing {

	String dateType;
	Date fromDate;
	Date endDate;
	String letterType;
	String branchName;
	String from;
	String status;

	public InwardListing() {
		super();
	}

	public InwardListing(String dateType, Date fromDate, Date endDate, String letterType, String branchName,
			String from, String status) {
		super();
		this.dateType = dateType;
		this.fromDate = fromDate;
		this.endDate = endDate;
		this.letterType = letterType;
		this.branchName = branchName;
		this.from = from;
		this.status = status;
	}

	public String getDateType() {
		return dateType;
	}

	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLetterType() {
		return letterType;
	}

	public void setLetterType(String letterType) {
		this.letterType = letterType;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
