package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tdoi_jpa_claim_query {
	private long claim_query_id;
	private long claim_recomm_id;
	private long jpa_claim_id;
	private int query_srno;
	private long query_type_id;
	private String query_type_desc;
	private LocalDate query_generate_dt;
	private short is_query_resolved;
	private LocalDate resolution_dt;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;

	public Tdoi_jpa_claim_query() {
		super();
	}

	public Tdoi_jpa_claim_query(long claim_query_id, long claim_recomm_id, long jpa_claim_id, int query_srno,
			long query_type_id, String query_type_desc, LocalDate query_generate_dt, short is_query_resolved,
			LocalDate resolution_dt, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.claim_query_id = claim_query_id;
		this.claim_recomm_id = claim_recomm_id;
		this.jpa_claim_id = jpa_claim_id;
		this.query_srno = query_srno;
		this.query_type_id = query_type_id;
		this.query_type_desc = query_type_desc;
		this.query_generate_dt = query_generate_dt;
		this.is_query_resolved = is_query_resolved;
		this.resolution_dt = resolution_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	public long getClaim_query_id() {
		return claim_query_id;
	}

	public void setClaim_query_id(long claim_query_id) {
		this.claim_query_id = claim_query_id;
	}

	public long getClaim_recomm_id() {
		return claim_recomm_id;
	}

	public void setClaim_recomm_id(long claim_recomm_id) {
		this.claim_recomm_id = claim_recomm_id;
	}

	public long getJpa_claim_id() {
		return jpa_claim_id;
	}

	public void setJpa_claim_id(long jpa_claim_id) {
		this.jpa_claim_id = jpa_claim_id;
	}

	public int getQuery_srno() {
		return query_srno;
	}

	public void setQuery_srno(int query_srno) {
		this.query_srno = query_srno;
	}

	public long getQuery_type_id() {
		return query_type_id;
	}

	public void setQuery_type_id(long query_type_id) {
		this.query_type_id = query_type_id;
	}

	public String getQuery_type_desc() {
		return query_type_desc;
	}

	public void setQuery_type_desc(String query_type_desc) {
		this.query_type_desc = query_type_desc;
	}

	public LocalDate getQuery_generate_dt() {
		return query_generate_dt;
	}

	public void setQuery_generate_dt(LocalDate query_generate_dt) {
		this.query_generate_dt = query_generate_dt;
	}

	public short getIs_query_resolved() {
		return is_query_resolved;
	}

	public void setIs_query_resolved(short is_query_resolved) {
		this.is_query_resolved = is_query_resolved;
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
