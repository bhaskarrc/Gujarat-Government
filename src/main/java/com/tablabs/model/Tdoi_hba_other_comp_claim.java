package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tdoi_hba_other_comp_claim {
	private long othr_comp_claim_id;
	private long hba_claim_id;
	private String company_name;
	private String policy_no;
	private LocalDate policy_start_dt;
	private LocalDate policy_end_dt;
	private double sum_insured;
	private double claim_amt_recevd;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;

	public Tdoi_hba_other_comp_claim() {
		super();
	}

	public Tdoi_hba_other_comp_claim(long othr_comp_claim_id, long hba_claim_id, String company_name, String policy_no,
			LocalDate policy_start_dt, LocalDate policy_end_dt, double sum_insured, double claim_amt_recevd,
			short active_status, LocalDateTime created_date, long created_by, long created_by_post,
			LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.othr_comp_claim_id = othr_comp_claim_id;
		this.hba_claim_id = hba_claim_id;
		this.company_name = company_name;
		this.policy_no = policy_no;
		this.policy_start_dt = policy_start_dt;
		this.policy_end_dt = policy_end_dt;
		this.sum_insured = sum_insured;
		this.claim_amt_recevd = claim_amt_recevd;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	public long getOthr_comp_claim_id() {
		return othr_comp_claim_id;
	}

	public void setOthr_comp_claim_id(long othr_comp_claim_id) {
		this.othr_comp_claim_id = othr_comp_claim_id;
	}

	public long getHba_claim_id() {
		return hba_claim_id;
	}

	public void setHba_claim_id(long hba_claim_id) {
		this.hba_claim_id = hba_claim_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}

	public LocalDate getPolicy_start_dt() {
		return policy_start_dt;
	}

	public void setPolicy_start_dt(LocalDate policy_start_dt) {
		this.policy_start_dt = policy_start_dt;
	}

	public LocalDate getPolicy_end_dt() {
		return policy_end_dt;
	}

	public void setPolicy_end_dt(LocalDate policy_end_dt) {
		this.policy_end_dt = policy_end_dt;
	}

	public double getSum_insured() {
		return sum_insured;
	}

	public void setSum_insured(double sum_insured) {
		this.sum_insured = sum_insured;
	}

	public double getClaim_amt_recevd() {
		return claim_amt_recevd;
	}

	public void setClaim_amt_recevd(double claim_amt_recevd) {
		this.claim_amt_recevd = claim_amt_recevd;
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
