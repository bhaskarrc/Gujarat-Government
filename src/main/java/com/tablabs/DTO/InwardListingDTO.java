package com.tablabs.DTO;

import java.util.Date;

public class InwardListingDTO {

	private String dateType;
	private Date fromDate;
	private Date endDate;
	private String letterType;
	private String branchName;
	private String letterReceivedFrom;
	private String status;

	public InwardListingDTO() {
		super();
	}

	public InwardListingDTO(String dateType, Date fromDate, Date endDate, String letterType, String branchName,
			String letterReceivedFrom, String status) {
		super();
		this.dateType = dateType;
		this.fromDate = fromDate;
		this.endDate = endDate;
		this.letterType = letterType;
		this.branchName = branchName;
		this.letterReceivedFrom = letterReceivedFrom;
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

	public String getLetterReceivedFrom() {
		return letterReceivedFrom;
	}

	public void setLetterReceivedFrom(String letterReceivedFrom) {
		this.letterReceivedFrom = letterReceivedFrom;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
