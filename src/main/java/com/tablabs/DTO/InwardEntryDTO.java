package com.tablabs.DTO;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class InwardEntryDTO {

	private String inwardNo;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate inwardDate;

	private String letterType;
	private String letterNo;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate letterDate;
	private String letterDetail;
	private String letterReceivedFrom;
	private String branchName;
	private String employeeName;

	public InwardEntryDTO() {
		super();
	}

	public InwardEntryDTO(String inwardNo, LocalDate inwardDate, String letterType, String letterNo,
			LocalDate letterDate, String letterDetail, String letterReceivedFrom, String branchName,
			String employeeName) {
		super();
		this.inwardNo = inwardNo;
		this.inwardDate = inwardDate;
		this.letterType = letterType;
		this.letterNo = letterNo;
		this.letterDate = letterDate;
		this.letterDetail = letterDetail;
		this.letterReceivedFrom = letterReceivedFrom;
		this.branchName = branchName;
		this.employeeName = employeeName;
	}

	public String getInwardNo() {
		return inwardNo;
	}

	public void setInwardNo(String inwardNo) {
		this.inwardNo = inwardNo;
	}

	public LocalDate getInwardDate() {
		return inwardDate;
	}

	public void setInwardDate(LocalDate inwardDate) {
		this.inwardDate = inwardDate;
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

	public String getLetterDetail() {
		return letterDetail;
	}

	public void setLetterDetail(String letterDetail) {
		this.letterDetail = letterDetail;
	}

	public String getLetterReceivedFrom() {
		return letterReceivedFrom;
	}

	public void setLetterReceivedFrom(String letterReceivedFrom) {
		this.letterReceivedFrom = letterReceivedFrom;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
