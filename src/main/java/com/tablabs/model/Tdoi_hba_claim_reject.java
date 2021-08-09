package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tdoi_hba_claim_reject {
	private long claim_reject_id;
	private long claim_recomm_id;
	private long hba_claim_id;
	private int reject_reason_srno;
	private long reject_type_id;
	private String reject_type_desc;
	private LocalDate reject_generate_dt;
	private short is_reject_resolved;
	private LocalDate resolution_dt;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;

	public Tdoi_hba_claim_reject() {
		super();
	}

	public Tdoi_hba_claim_reject(long claim_reject_id, long claim_recomm_id, long hba_claim_id, int reject_reason_srno,
			long reject_type_id, String reject_type_desc, LocalDate reject_generate_dt, short is_reject_resolved,
			LocalDate resolution_dt, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.claim_reject_id = claim_reject_id;
		this.claim_recomm_id = claim_recomm_id;
		this.hba_claim_id = hba_claim_id;
		this.reject_reason_srno = reject_reason_srno;
		this.reject_type_id = reject_type_id;
		this.reject_type_desc = reject_type_desc;
		this.reject_generate_dt = reject_generate_dt;
		this.is_reject_resolved = is_reject_resolved;
		this.resolution_dt = resolution_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	public long getClaim_reject_id() {
		return claim_reject_id;
	}

	public void setClaim_reject_id(long claim_reject_id) {
		this.claim_reject_id = claim_reject_id;
	}

	public long getClaim_recomm_id() {
		return claim_recomm_id;
	}

	public void setClaim_recomm_id(long claim_recomm_id) {
		this.claim_recomm_id = claim_recomm_id;
	}

	public long getHba_claim_id() {
		return hba_claim_id;
	}

	public void setHba_claim_id(long hba_claim_id) {
		this.hba_claim_id = hba_claim_id;
	}

	public int getReject_reason_srno() {
		return reject_reason_srno;
	}

	public void setReject_reason_srno(int reject_reason_srno) {
		this.reject_reason_srno = reject_reason_srno;
	}

	public long getReject_type_id() {
		return reject_type_id;
	}

	public void setReject_type_id(long reject_type_id) {
		this.reject_type_id = reject_type_id;
	}

	public String getReject_type_desc() {
		return reject_type_desc;
	}

	public void setReject_type_desc(String reject_type_desc) {
		this.reject_type_desc = reject_type_desc;
	}

	public LocalDate getReject_generate_dt() {
		return reject_generate_dt;
	}

	public void setReject_generate_dt(LocalDate reject_generate_dt) {
		this.reject_generate_dt = reject_generate_dt;
	}

	public short getIs_reject_resolved() {
		return is_reject_resolved;
	}

	public void setIs_reject_resolved(short is_reject_resolved) {
		this.is_reject_resolved = is_reject_resolved;
	}

	public LocalDate getResolution_dt() {
		return resolution_dt;
	}

	public void setResolution_dt(LocalDate resolution_dt) {
		this.resolution_dt = resolution_dt;
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
