package com.tablabs.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InwardListingResponseDTO {

	private long inward_no;
	private LocalDate inward_dt;
	private String letter_type;
	private String letter_no;
	private LocalDate letter_dt;
	private String from_where_details;
	private String branch_name;
	private String doi_employee_name;
	private LocalDateTime created_date;
	private LocalDateTime updated_date;
	private String active_status;

	public InwardListingResponseDTO() {
		super();
	}

	public InwardListingResponseDTO(long inward_no, LocalDate inward_dt, String letter_type, String letter_no,
			LocalDate letter_dt, String from_where_details, String branch_name, String doi_employee_name,
			LocalDateTime created_date, LocalDateTime updated_date, String active_status) {
		super();
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.letter_type = letter_type;
		this.letter_no = letter_no;
		this.letter_dt = letter_dt;
		this.from_where_details = from_where_details;
		this.branch_name = branch_name;
		this.doi_employee_name = doi_employee_name;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.active_status = active_status;
	}

	public long getInward_no() {
		return inward_no;
	}

	public void setInward_no(long inward_no) {
		this.inward_no = inward_no;
	}

	public LocalDate getInward_dt() {
		return inward_dt;
	}

	public void setInward_dt(LocalDate inward_dt) {
		this.inward_dt = inward_dt;
	}

	public String getLetter_type() {
		return letter_type;
	}

	public void setLetter_type(String letter_type) {
		this.letter_type = letter_type;
	}

	public String getLetter_no() {
		return letter_no;
	}

	public void setLetter_no(String letter_no) {
		this.letter_no = letter_no;
	}

	public LocalDate getLetter_dt() {
		return letter_dt;
	}

	public void setLetter_dt(LocalDate letter_dt) {
		this.letter_dt = letter_dt;
	}

	public String getFrom_where_details() {
		return from_where_details;
	}

	public void setFrom_where_details(String from_where_details) {
		this.from_where_details = from_where_details;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getDoi_employee_name() {
		return doi_employee_name;
	}

	public void setDoi_employee_name(String doi_employee_name) {
		this.doi_employee_name = doi_employee_name;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public String getActive_status() {
		return active_status;
	}

	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}

}
