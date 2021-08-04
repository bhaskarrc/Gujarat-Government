package com.tablabs.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TDOI_OUTWARD_ENTRY", schema="DOI")
public class Outward_Entry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long outward_id;
	
	long outward_no;
	Date outward_dt;
	long letter_type_id;
	String letter_type;
	String inward_letter_no;
	String letter_details;
	String sent_to_details;
	long frm_branch_id;
	long outward_mode_id;
	double outward_amt;
	String remarks;
	String reference_no;
	LocalDateTime reference_dt;
	int active_status;
	LocalDateTime created_date;
	long created_by;
	long created_by_post;
	LocalDateTime updated_date;
	long updated_by;
	long updated_by_post;

	public Outward_Entry() {
		super();
	}

	public Outward_Entry(long outward_id, long outward_no, Date outward_dt, long letter_type_id, String letter_type,
			String inward_letter_no, String letter_details, String sent_to_details, long frm_branch_id,
			long outward_mode_id, double outward_amt, String remarks, String reference_no, LocalDateTime reference_dt,
			int active_status, LocalDateTime created_date, long created_by, long created_by_post,
			LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.outward_id = outward_id;
		this.outward_no = outward_no;
		this.outward_dt = outward_dt;
		this.letter_type_id = letter_type_id;
		this.letter_type = letter_type;
		this.inward_letter_no = inward_letter_no;
		this.letter_details = letter_details;
		this.sent_to_details = sent_to_details;
		this.frm_branch_id = frm_branch_id;
		this.outward_mode_id = outward_mode_id;
		this.outward_amt = outward_amt;
		this.remarks = remarks;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	public long getOutward_id() {
		return outward_id;
	}

	public void setOutward_id(long outward_id) {
		this.outward_id = outward_id;
	}

	public long getOutward_no() {
		return outward_no;
	}

	public void setOutward_no(long outward_no) {
		this.outward_no = outward_no;
	}

	public Date getOutward_dt() {
		return outward_dt;
	}

	public void setOutward_dt(Date outward_dt) {
		this.outward_dt = outward_dt;
	}

	public long getLetter_type_id() {
		return letter_type_id;
	}

	public void setLetter_type_id(long letter_type_id) {
		this.letter_type_id = letter_type_id;
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

	public String getLetter_details() {
		return letter_details;
	}

	public void setLetter_details(String letter_details) {
		this.letter_details = letter_details;
	}

	public String getSent_to_details() {
		return sent_to_details;
	}

	public void setSent_to_details(String sent_to_details) {
		this.sent_to_details = sent_to_details;
	}

	public long getFrm_branch_id() {
		return frm_branch_id;
	}

	public void setFrm_branch_id(long frm_branch_id) {
		this.frm_branch_id = frm_branch_id;
	}

	public long getOutward_mode_id() {
		return outward_mode_id;
	}

	public void setOutward_mode_id(long outward_mode_id) {
		this.outward_mode_id = outward_mode_id;
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

	public String getReference_no() {
		return reference_no;
	}

	public void setReference_no(String reference_no) {
		this.reference_no = reference_no;
	}

	public LocalDateTime getReference_dt() {
		return reference_dt;
	}

	public void setReference_dt(LocalDateTime reference_dt) {
		this.reference_dt = reference_dt;
	}

	public int getActive_status() {
		return active_status;
	}

	public void setActive_status(int active_status) {
		this.active_status = active_status;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}

	public long getCreated_by_post() {
		return created_by_post;
	}

	public void setCreated_by_post(long created_by_post) {
		this.created_by_post = created_by_post;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(long updated_by) {
		this.updated_by = updated_by;
	}

	public long getUpdated_by_post() {
		return updated_by_post;
	}

	public void setUpdated_by_post(long updated_by_post) {
		this.updated_by_post = updated_by_post;
	}

}
