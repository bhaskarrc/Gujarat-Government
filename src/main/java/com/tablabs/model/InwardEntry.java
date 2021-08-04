package com.tablabs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InwardEntry {

	@Id
	int id;

	int inwardNumber;
	Date inwardDate;
	String letterType;
	String lettterNumber;
	Date letterDate;
	String letterDetail;
	String from;
	String branchName;
	String empName;

	public InwardEntry() {
		super();
	}

	public InwardEntry(int id, int inwardNumber, Date inwardDate, String letterType, String lettterNumber,
			Date letterDate, String letterDetail, String from, String branchName, String empName) {
		super();
		this.id = id;
		this.inwardNumber = inwardNumber;
		this.inwardDate = inwardDate;
		this.letterType = letterType;
		this.lettterNumber = lettterNumber;
		this.letterDate = letterDate;
		this.letterDetail = letterDetail;
		this.from = from;
		this.branchName = branchName;
		this.empName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInwardNumber() {
		return inwardNumber;
	}

	public void setInwardNumber(int inwardNumber) {
		this.inwardNumber = inwardNumber;
	}

	public Date getInwardDate() {
		return inwardDate;
	}

	public void setInwardDate(Date inwardDate) {
		this.inwardDate = inwardDate;
	}

	public String getLetterType() {
		return letterType;
	}

	public void setLetterType(String letterType) {
		this.letterType = letterType;
	}

	public String getLettterNumber() {
		return lettterNumber;
	}

	public void setLettterNumber(String lettterNumber) {
		this.lettterNumber = lettterNumber;
	}

	public Date getLetterDate() {
		return letterDate;
	}

	public void setLetterDate(Date letterDate) {
		this.letterDate = letterDate;
	}

	public String getLetterDetail() {
		return letterDetail;
	}

	public void setLetterDetail(String letterDetail) {
		this.letterDetail = letterDetail;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
