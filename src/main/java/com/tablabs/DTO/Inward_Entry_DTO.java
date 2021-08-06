package com.tablabs.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Inward_Entry_DTO {

	String date_type;
	LocalDate from_date;
	LocalDate end_date;
	String letter_type;
	String branch_name;
	String letter_received_from;
	String status;

	public Inward_Entry_DTO() {
		super();
	}

	public Inward_Entry_DTO(String date_type, LocalDate from_date, LocalDate end_date, String letter_type,
			String branch_name, String letter_received_from, String status) {
		super();
		this.date_type = date_type;
		this.from_date = from_date;
		this.end_date = end_date;
		this.letter_type = letter_type;
		this.branch_name = branch_name;
		this.letter_received_from = letter_received_from;
		this.status = status;
	}

	public String getDate_type() {
		return date_type;
	}

	public void setDate_type(String date_type) {
		this.date_type = date_type;
	}

	public LocalDate getFrom_date() {
		return from_date;
	}

	public void setFrom_date(LocalDate from_date) {
		this.from_date = from_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}

	public String getLetter_type() {
		return letter_type;
	}

	public void setLetter_type(String letter_type) {
		this.letter_type = letter_type;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getLetter_received_from() {
		return letter_received_from;
	}

	public void setLetter_received_from(String letter_received_from) {
		this.letter_received_from = letter_received_from;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
