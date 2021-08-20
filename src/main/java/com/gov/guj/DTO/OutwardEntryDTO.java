package com.tablabs.DTO;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OutwardEntryDTO {

	private String outward_no;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate outward_dt;

	private String letter_type;
	private String inward_letter_no;
	private String sent_to_details;
	private String from_branch_or_unit; // np
	private String outward_mode; // np
	private double outward_amt;
	private String remarks;

	@Override
	public String toString() {
		return "OutwardEntryDTO [outward_No=" + outward_no + ", outward_dt=" + outward_dt + ", letter_type="
				+ letter_type + ", inward_letter_no=" + inward_letter_no + ", sent_to_details=" + sent_to_details
				+ ", from_branch_or_unit=" + from_branch_or_unit + ", outward_mode=" + outward_mode + ", outward_amt="
				+ outward_amt + ", remarks=" + remarks + "]";
	}

	public OutwardEntryDTO() {
		super();
	}

	public OutwardEntryDTO(String outward_no, LocalDate outward_dt, String letter_type, String inward_letter_no,
			String sent_to_details, String from_branch_or_unit, String outward_mode, double outward_amt,
			String remarks) {
		super();
		this.outward_no = outward_no;
		this.outward_dt = outward_dt;
		this.letter_type = letter_type;
		this.inward_letter_no = inward_letter_no;
		this.sent_to_details = sent_to_details;
		this.from_branch_or_unit = from_branch_or_unit;
		this.outward_mode = outward_mode;
		this.outward_amt = outward_amt;
		this.remarks = remarks;
	}

	public String getOutward_no() {
		return outward_no;
	}

	public void setOutward_no(String outward_no) {
		this.outward_no = outward_no;
	}

	public LocalDate getOutward_dt() {
		return outward_dt;
	}

	public void setOutward_dt(LocalDate outward_dt) {
		this.outward_dt = outward_dt;
	}

	public String getLetter_type() {
		return letter_type;
	}

	public void setLetter_type(String letter_type) {
		this.letter_type = letter_type;
	}

	public String getInward_letter_no() {
		return inward_letter_no;
	}

	public void setInward_letter_no(String inward_letter_no) {
		this.inward_letter_no = inward_letter_no;
	}

	public String getSent_to_details() {
		return sent_to_details;
	}

	public void setSent_to_details(String sent_to_details) {
		this.sent_to_details = sent_to_details;
	}

	public String getFrom_branch_or_unit() {
		return from_branch_or_unit;
	}

	public void setFrom_branch_or_unit(String from_branch_or_unit) {
		this.from_branch_or_unit = from_branch_or_unit;
	}

	public String getOutward_mode() {
		return outward_mode;
	}

	public void setOutward_mode(String outward_mode) {
		this.outward_mode = outward_mode;
	}

	public double getOutward_amt() {
		return outward_amt;
	}

	public void setOutward_amt(double outward_amt) {
		this.outward_amt = outward_amt;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
