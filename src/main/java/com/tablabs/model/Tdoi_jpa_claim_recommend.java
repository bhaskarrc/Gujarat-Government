package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tdoi_jpa_claim_recommend {
	private long claim_recomm_id;
	private long jpa_claim_id;
	private String claim_number;
	private long recommend_type_id;
	private String recommend_status;
	private long surveyor_id;
	private String surveyor_name;
	private LocalDate recommend_dt;
	private LocalDate settlement_dt;
	private LocalDate reopen_dt;
	private short is_legal_requested;
	private long legal_entry_id;
	private LocalDate legal_request_dt;
	private LocalDate payment_send_dt;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;

	public Tdoi_jpa_claim_recommend() {
		super();
	}

	public Tdoi_jpa_claim_recommend(long claim_recomm_id, long jpa_claim_id, String claim_number,
			long recommend_type_id, String recommend_status, long surveyor_id, String surveyor_name,
			LocalDate recommend_dt, LocalDate settlement_dt, LocalDate reopen_dt, short is_legal_requested,
			long legal_entry_id, LocalDate legal_request_dt, LocalDate payment_send_dt, short active_status,
			LocalDateTime created_date, long created_by, long created_by_post, LocalDateTime updated_date,
			long updated_by, long updated_by_post) {
		super();
		this.claim_recomm_id = claim_recomm_id;
		this.jpa_claim_id = jpa_claim_id;
		this.claim_number = claim_number;
		this.recommend_type_id = recommend_type_id;
		this.recommend_status = recommend_status;
		this.surveyor_id = surveyor_id;
		this.surveyor_name = surveyor_name;
		this.recommend_dt = recommend_dt;
		this.settlement_dt = settlement_dt;
		this.reopen_dt = reopen_dt;
		this.is_legal_requested = is_legal_requested;
		this.legal_entry_id = legal_entry_id;
		this.legal_request_dt = legal_request_dt;
		this.payment_send_dt = payment_send_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
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

	public String getClaim_number() {
		return claim_number;
	}

	public void setClaim_number(String claim_number) {
		this.claim_number = claim_number;
	}

	public long getRecommend_type_id() {
		return recommend_type_id;
	}

	public void setRecommend_type_id(long recommend_type_id) {
		this.recommend_type_id = recommend_type_id;
	}

	public String getRecommend_status() {
		return recommend_status;
	}

	public void setRecommend_status(String recommend_status) {
		this.recommend_status = recommend_status;
	}

	public long getSurveyor_id() {
		return surveyor_id;
	}

	public void setSurveyor_id(long surveyor_id) {
		this.surveyor_id = surveyor_id;
	}

	public String getSurveyor_name() {
		return surveyor_name;
	}

	public void setSurveyor_name(String surveyor_name) {
		this.surveyor_name = surveyor_name;
	}

	public LocalDate getRecommend_dt() {
		return recommend_dt;
	}

	public void setRecommend_dt(LocalDate recommend_dt) {
		this.recommend_dt = recommend_dt;
	}

	public LocalDate getSettlement_dt() {
		return settlement_dt;
	}

	public void setSettlement_dt(LocalDate settlement_dt) {
		this.settlement_dt = settlement_dt;
	}

	public LocalDate getReopen_dt() {
		return reopen_dt;
	}

	public void setReopen_dt(LocalDate reopen_dt) {
		this.reopen_dt = reopen_dt;
	}

	public short getIs_legal_requested() {
		return is_legal_requested;
	}

	public void setIs_legal_requested(short is_legal_requested) {
		this.is_legal_requested = is_legal_requested;
	}

	public long getLegal_entry_id() {
		return legal_entry_id;
	}

	public void setLegal_entry_id(long legal_entry_id) {
		this.legal_entry_id = legal_entry_id;
	}

	public LocalDate getLegal_request_dt() {
		return legal_request_dt;
	}

	public void setLegal_request_dt(LocalDate legal_request_dt) {
		this.legal_request_dt = legal_request_dt;
	}

	public LocalDate getPayment_send_dt() {
		return payment_send_dt;
	}

	public void setPayment_send_dt(LocalDate payment_send_dt) {
		this.payment_send_dt = payment_send_dt;
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
