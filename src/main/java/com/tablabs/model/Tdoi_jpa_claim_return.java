package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tdoi_jpa_claim_return {
	private long claim_return_id;
	private long jpa_claim_id;
	private long field_type_id;
	private String field_name;
	private String field_remarks;
	private long send_by_officer_id;
	private String send_by_officer_name;
	private LocalDate sent_back_dt;
	private LocalDate updation_dt;
	private String field_updated_value;
	private String return_status;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;

	public Tdoi_jpa_claim_return() {
		super();
	}

	public Tdoi_jpa_claim_return(long claim_return_id, long jpa_claim_id, long field_type_id, String field_name,
			String field_remarks, long send_by_officer_id, String send_by_officer_name, LocalDate sent_back_dt,
			LocalDate updation_dt, String field_updated_value, String return_status, short active_status,
			LocalDateTime created_date, long created_by, long created_by_post, LocalDateTime updated_date,
			long updated_by, long updated_by_post) {
		super();
		this.claim_return_id = claim_return_id;
		this.jpa_claim_id = jpa_claim_id;
		this.field_type_id = field_type_id;
		this.field_name = field_name;
		this.field_remarks = field_remarks;
		this.send_by_officer_id = send_by_officer_id;
		this.send_by_officer_name = send_by_officer_name;
		this.sent_back_dt = sent_back_dt;
		this.updation_dt = updation_dt;
		this.field_updated_value = field_updated_value;
		this.return_status = return_status;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	public long getClaim_return_id() {
		return claim_return_id;
	}

	public void setClaim_return_id(long claim_return_id) {
		this.claim_return_id = claim_return_id;
	}

	public long getJpa_claim_id() {
		return jpa_claim_id;
	}

	public void setJpa_claim_id(long jpa_claim_id) {
		this.jpa_claim_id = jpa_claim_id;
	}

	public long getField_type_id() {
		return field_type_id;
	}

	public void setField_type_id(long field_type_id) {
		this.field_type_id = field_type_id;
	}

	public String getField_name() {
		return field_name;
	}

	public void setField_name(String field_name) {
		this.field_name = field_name;
	}

	public String getField_remarks() {
		return field_remarks;
	}

	public void setField_remarks(String field_remarks) {
		this.field_remarks = field_remarks;
	}

	public long getSend_by_officer_id() {
		return send_by_officer_id;
	}

	public void setSend_by_officer_id(long send_by_officer_id) {
		this.send_by_officer_id = send_by_officer_id;
	}

	public String getSend_by_officer_name() {
		return send_by_officer_name;
	}

	public void setSend_by_officer_name(String send_by_officer_name) {
		this.send_by_officer_name = send_by_officer_name;
	}

	public LocalDate getSent_back_dt() {
		return sent_back_dt;
	}

	public void setSent_back_dt(LocalDate sent_back_dt) {
		this.sent_back_dt = sent_back_dt;
	}

	public LocalDate getUpdation_dt() {
		return updation_dt;
	}

	public void setUpdation_dt(LocalDate updation_dt) {
		this.updation_dt = updation_dt;
	}

	public String getField_updated_value() {
		return field_updated_value;
	}

	public void setField_updated_value(String field_updated_value) {
		this.field_updated_value = field_updated_value;
	}

	public String getReturn_status() {
		return return_status;
	}

	public void setReturn_status(String return_status) {
		this.return_status = return_status;
	}

	public short getActive_status() {
		return active_status;
	}

	public void setActive_status(short active_status) {
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
