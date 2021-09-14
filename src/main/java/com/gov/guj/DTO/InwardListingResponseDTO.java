package com.gov.guj.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InwardListingResponseDTO {

	private String inward_id;
	private String inward_no;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate inward_dt;
	private String inward_type;
	private String letter_type;
	private String cheque_type;
	private String letter_no;
	private long cheque_no;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate letter_dt;
	private LocalDate cheque_dt;
	private String from_where_details;
	private String doi_branch_id;
	private String doi_employee_name;
	private String bank_name;
	private String bank_branch_name;
	private Double amount;
	private String active_status;
	private String letter_details;

	public InwardListingResponseDTO() {
		super();
	}

	public InwardListingResponseDTO(String inward_id, String inward_no, LocalDate inward_dt, String inward_type,
			String letter_type, String cheque_type, String letter_no, long cheque_no, LocalDate letter_dt,
			LocalDate cheque_dt, String from_where_details, String doi_branch_id, String doi_employee_name,
			String bank_name, String bank_branch_name, Double amount, String active_status, String letter_details) {
		super();
		this.inward_id = inward_id;
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.inward_type = inward_type;
		this.letter_type = letter_type;
		this.cheque_type = cheque_type;
		this.letter_no = letter_no;
		this.cheque_no = cheque_no;
		this.letter_dt = letter_dt;
		this.cheque_dt = cheque_dt;
		this.from_where_details = from_where_details;
		this.doi_branch_id = doi_branch_id;
		this.doi_employee_name = doi_employee_name;
		this.bank_name = bank_name;
		this.bank_branch_name = bank_branch_name;
		this.amount = amount;
		this.active_status = active_status;
		this.letter_details = letter_details;
	}

	public String getInward_id() {
		return inward_id;
	}

	public void setInward_id(String inward_id) {
		this.inward_id = inward_id;
	}

	public String getInward_no() {
		return inward_no;
	}

	public void setInward_no(String inward_no) {
		this.inward_no = inward_no;
	}

	public LocalDate getInward_dt() {
		return inward_dt;
	}

	public void setInward_dt(LocalDate inward_dt) {
		this.inward_dt = inward_dt;
	}

	public String getInward_type() {
		return inward_type;
	}

	public void setInward_type(String inward_type) {
		this.inward_type = inward_type;
	}

	public String getLetter_type() {
		return letter_type;
	}

	public void setLetter_type(String letter_type) {
		this.letter_type = letter_type;
	}

	public String getCheque_type() {
		return cheque_type;
	}

	public void setCheque_type(String cheque_type) {
		this.cheque_type = cheque_type;
	}

	public String getLetter_no() {
		return letter_no;
	}

	public void setLetter_no(String letter_no) {
		this.letter_no = letter_no;
	}

	public long getCheque_no() {
		return cheque_no;
	}

	public void setCheque_no(long cheque_no) {
		this.cheque_no = cheque_no;
	}

	public LocalDate getLetter_dt() {
		return letter_dt;
	}

	public void setLetter_dt(LocalDate letter_dt) {
		this.letter_dt = letter_dt;
	}

	public LocalDate getCheque_dt() {
		return cheque_dt;
	}

	public void setCheque_dt(LocalDate cheque_dt) {
		this.cheque_dt = cheque_dt;
	}

	public String getFrom_where_details() {
		return from_where_details;
	}

	public void setFrom_where_details(String from_where_details) {
		this.from_where_details = from_where_details;
	}

	public String getDoi_branch_id() {
		return doi_branch_id;
	}

	public void setDoi_branch_id(String doi_branch_id) {
		this.doi_branch_id = doi_branch_id;
	}

	public String getDoi_employee_name() {
		return doi_employee_name;
	}

	public void setDoi_employee_name(String doi_employee_name) {
		this.doi_employee_name = doi_employee_name;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBank_branch_name() {
		return bank_branch_name;
	}

	public void setBank_branch_name(String bank_branch_name) {
		this.bank_branch_name = bank_branch_name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getActive_status() {
		return active_status;
	}

	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}

	public String getLetter_details() {
		return letter_details;
	}

	public void setLetter_details(String letter_details) {
		this.letter_details = letter_details;
	}

}
