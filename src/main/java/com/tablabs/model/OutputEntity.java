package com.tablabs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OutputEntity {

	@Id
	int id;

	String outwardNumber;
	Date outwardDate;
	String letterType;
	String letterNumber;
	Date letterDate;
	String inwardLetterNo;
	String to;
	String from;
	String outwardMode;
	int amount;
	String remarks;

	public OutputEntity() {
		super();
	}

	public OutputEntity(int id, String outwardNumber, Date outwardDate, String letterType, String letterNumber,
			Date letterDate, String inwardLetterNo, String to, String from, String outwardMode, int amount,
			String remarks) {
		super();
		this.id = id;
		this.outwardNumber = outwardNumber;
		this.outwardDate = outwardDate;
		this.letterType = letterType;
		this.letterNumber = letterNumber;
		this.letterDate = letterDate;
		this.inwardLetterNo = inwardLetterNo;
		this.to = to;
		this.from = from;
		this.outwardMode = outwardMode;
		this.amount = amount;
		this.remarks = remarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getInwardLetterNo() {
		return inwardLetterNo;
	}

	public void setInwardLetterNo(String inwardLetterNo) {
		this.inwardLetterNo = inwardLetterNo;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getOutwardMode() {
		return outwardMode;
	}

	public void setOutwardMode(String outwardMode) {
		this.outwardMode = outwardMode;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
