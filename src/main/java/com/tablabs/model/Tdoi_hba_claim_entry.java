package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tdoi_hba_claim_entry {
	private long hba_claim_id;
	private String claim_no;
	private long inward_id;
	private String inward_no;
	private LocalDate inward_dt;
	private LocalDate inward_accept_dt;
	private long hba_proposal_id;
	private String hba_policy_no;
	private LocalDate policy_start_dt;
	private LocalDate policy_end_dt;
	private double sum_insured;
	private String insured_name;
	private String insured_address;
	private long aadhar_num;
	private long mobile_num;
	private String email_address;
	private short insur_other_company;
	private LocalDate loss_date;
	private String loss_time;
	private String cause_of_loss;
	private String extent_of_loss;
	private short is_surveyor_assgn;
	private long surveyor_id;
	private String surveyor_name;
	private String surv_bill_no;
	private LocalDate surv_bill_dt;
	private double surv_fee_amount;
	private double claim_amount;
	private long claim_month_id;
	private long claim_year_id;
	private LocalDateTime claim_generate_dt;
	private long claim_status_id;
	private String claim_status;
	private LocalDate claim_accept_dt;
	private long claim_accept_by_id;
	private String claim_entry_status;
	private String reject_reason;
	private LocalDate rejection_dt;
	private long rejected_by;
	private short is_sent_for_pay;
	private short is_payment_done;
	private String transaction_id;
	private long cheque_num;
	private LocalDate payment_dt;
	private double paid_amount;
	private double surveyor_payment;
	private String reference_no;
	private LocalDateTime reference_dt;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;

	public Tdoi_hba_claim_entry() {
		super();
	}

	public Tdoi_hba_claim_entry(long hba_claim_id, String claim_no, long inward_id, String inward_no,
			LocalDate inward_dt, LocalDate inward_accept_dt, long hba_proposal_id, String hba_policy_no,
			LocalDate policy_start_dt, LocalDate policy_end_dt, double sum_insured, String insured_name,
			String insured_address, long aadhar_num, long mobile_num, String email_address, short insur_other_company,
			LocalDate loss_date, String loss_time, String cause_of_loss, String extent_of_loss, short is_surveyor_assgn,
			long surveyor_id, String surveyor_name, String surv_bill_no, LocalDate surv_bill_dt, double surv_fee_amount,
			double claim_amount, long claim_month_id, long claim_year_id, LocalDateTime claim_generate_dt,
			long claim_status_id, String claim_status, LocalDate claim_accept_dt, long claim_accept_by_id,
			String claim_entry_status, String reject_reason, LocalDate rejection_dt, long rejected_by,
			short is_sent_for_pay, short is_payment_done, String transaction_id, long cheque_num, LocalDate payment_dt,
			double paid_amount, double surveyor_payment, String reference_no, LocalDateTime reference_dt,
			short active_status, LocalDateTime created_date, long created_by, long created_by_post,
			LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.hba_claim_id = hba_claim_id;
		this.claim_no = claim_no;
		this.inward_id = inward_id;
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.inward_accept_dt = inward_accept_dt;
		this.hba_proposal_id = hba_proposal_id;
		this.hba_policy_no = hba_policy_no;
		this.policy_start_dt = policy_start_dt;
		this.policy_end_dt = policy_end_dt;
		this.sum_insured = sum_insured;
		this.insured_name = insured_name;
		this.insured_address = insured_address;
		this.aadhar_num = aadhar_num;
		this.mobile_num = mobile_num;
		this.email_address = email_address;
		this.insur_other_company = insur_other_company;
		this.loss_date = loss_date;
		this.loss_time = loss_time;
		this.cause_of_loss = cause_of_loss;
		this.extent_of_loss = extent_of_loss;
		this.is_surveyor_assgn = is_surveyor_assgn;
		this.surveyor_id = surveyor_id;
		this.surveyor_name = surveyor_name;
		this.surv_bill_no = surv_bill_no;
		this.surv_bill_dt = surv_bill_dt;
		this.surv_fee_amount = surv_fee_amount;
		this.claim_amount = claim_amount;
		this.claim_month_id = claim_month_id;
		this.claim_year_id = claim_year_id;
		this.claim_generate_dt = claim_generate_dt;
		this.claim_status_id = claim_status_id;
		this.claim_status = claim_status;
		this.claim_accept_dt = claim_accept_dt;
		this.claim_accept_by_id = claim_accept_by_id;
		this.claim_entry_status = claim_entry_status;
		this.reject_reason = reject_reason;
		this.rejection_dt = rejection_dt;
		this.rejected_by = rejected_by;
		this.is_sent_for_pay = is_sent_for_pay;
		this.is_payment_done = is_payment_done;
		this.transaction_id = transaction_id;
		this.cheque_num = cheque_num;
		this.payment_dt = payment_dt;
		this.paid_amount = paid_amount;
		this.surveyor_payment = surveyor_payment;
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

	public long getHba_claim_id() {
		return hba_claim_id;
	}

	public void setHba_claim_id(long hba_claim_id) {
		this.hba_claim_id = hba_claim_id;
	}

	public String getClaim_no() {
		return claim_no;
	}

	public void setClaim_no(String claim_no) {
		this.claim_no = claim_no;
	}

	public long getInward_id() {
		return inward_id;
	}

	public void setInward_id(long inward_id) {
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

	public LocalDate getInward_accept_dt() {
		return inward_accept_dt;
	}

	public void setInward_accept_dt(LocalDate inward_accept_dt) {
		this.inward_accept_dt = inward_accept_dt;
	}

	public long getHba_proposal_id() {
		return hba_proposal_id;
	}

	public void setHba_proposal_id(long hba_proposal_id) {
		this.hba_proposal_id = hba_proposal_id;
	}

	public String getHba_policy_no() {
		return hba_policy_no;
	}

	public void setHba_policy_no(String hba_policy_no) {
		this.hba_policy_no = hba_policy_no;
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

	public String getInsured_name() {
		return insured_name;
	}

	public void setInsured_name(String insured_name) {
		this.insured_name = insured_name;
	}

	public String getInsured_address() {
		return insured_address;
	}

	public void setInsured_address(String insured_address) {
		this.insured_address = insured_address;
	}

	public long getAadhar_num() {
		return aadhar_num;
	}

	public void setAadhar_num(long aadhar_num) {
		this.aadhar_num = aadhar_num;
	}

	public long getMobile_num() {
		return mobile_num;
	}

	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public short getInsur_other_company() {
		return insur_other_company;
	}

	public void setInsur_other_company(short insur_other_company) {
		this.insur_other_company = insur_other_company;
	}

	public LocalDate getLoss_date() {
		return loss_date;
	}

	public void setLoss_date(LocalDate loss_date) {
		this.loss_date = loss_date;
	}

	public String getLoss_time() {
		return loss_time;
	}

	public void setLoss_time(String loss_time) {
		this.loss_time = loss_time;
	}

	public String getCause_of_loss() {
		return cause_of_loss;
	}

	public void setCause_of_loss(String cause_of_loss) {
		this.cause_of_loss = cause_of_loss;
	}

	public String getExtent_of_loss() {
		return extent_of_loss;
	}

	public void setExtent_of_loss(String extent_of_loss) {
		this.extent_of_loss = extent_of_loss;
	}

	public short getIs_surveyor_assgn() {
		return is_surveyor_assgn;
	}

	public void setIs_surveyor_assgn(short is_surveyor_assgn) {
		this.is_surveyor_assgn = is_surveyor_assgn;
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

	public String getSurv_bill_no() {
		return surv_bill_no;
	}

	public void setSurv_bill_no(String surv_bill_no) {
		this.surv_bill_no = surv_bill_no;
	}

	public LocalDate getSurv_bill_dt() {
		return surv_bill_dt;
	}

	public void setSurv_bill_dt(LocalDate surv_bill_dt) {
		this.surv_bill_dt = surv_bill_dt;
	}

	public double getSurv_fee_amount() {
		return surv_fee_amount;
	}

	public void setSurv_fee_amount(double surv_fee_amount) {
		this.surv_fee_amount = surv_fee_amount;
	}

	public double getClaim_amount() {
		return claim_amount;
	}

	public void setClaim_amount(double claim_amount) {
		this.claim_amount = claim_amount;
	}

	public long getClaim_month_id() {
		return claim_month_id;
	}

	public void setClaim_month_id(long claim_month_id) {
		this.claim_month_id = claim_month_id;
	}

	public long getClaim_year_id() {
		return claim_year_id;
	}

	public void setClaim_year_id(long claim_year_id) {
		this.claim_year_id = claim_year_id;
	}

	public LocalDateTime getClaim_generate_dt() {
		return claim_generate_dt;
	}

	public void setClaim_generate_dt(LocalDateTime claim_generate_dt) {
		this.claim_generate_dt = claim_generate_dt;
	}

	public long getClaim_status_id() {
		return claim_status_id;
	}

	public void setClaim_status_id(long claim_status_id) {
		this.claim_status_id = claim_status_id;
	}

	public String getClaim_status() {
		return claim_status;
	}

	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}

	public LocalDate getClaim_accept_dt() {
		return claim_accept_dt;
	}

	public void setClaim_accept_dt(LocalDate claim_accept_dt) {
		this.claim_accept_dt = claim_accept_dt;
	}

	public long getClaim_accept_by_id() {
		return claim_accept_by_id;
	}

	public void setClaim_accept_by_id(long claim_accept_by_id) {
		this.claim_accept_by_id = claim_accept_by_id;
	}

	public String getClaim_entry_status() {
		return claim_entry_status;
	}

	public void setClaim_entry_status(String claim_entry_status) {
		this.claim_entry_status = claim_entry_status;
	}

	public String getReject_reason() {
		return reject_reason;
	}

	public void setReject_reason(String reject_reason) {
		this.reject_reason = reject_reason;
	}

	public LocalDate getRejection_dt() {
		return rejection_dt;
	}

	public void setRejection_dt(LocalDate rejection_dt) {
		this.rejection_dt = rejection_dt;
	}

	public long getRejected_by() {
		return rejected_by;
	}

	public void setRejected_by(long rejected_by) {
		this.rejected_by = rejected_by;
	}

	public short getIs_sent_for_pay() {
		return is_sent_for_pay;
	}

	public void setIs_sent_for_pay(short is_sent_for_pay) {
		this.is_sent_for_pay = is_sent_for_pay;
	}

	public short getIs_payment_done() {
		return is_payment_done;
	}

	public void setIs_payment_done(short is_payment_done) {
		this.is_payment_done = is_payment_done;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}

	public long getCheque_num() {
		return cheque_num;
	}

	public void setCheque_num(long cheque_num) {
		this.cheque_num = cheque_num;
	}

	public LocalDate getPayment_dt() {
		return payment_dt;
	}

	public void setPayment_dt(LocalDate payment_dt) {
		this.payment_dt = payment_dt;
	}

	public double getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(double paid_amount) {
		this.paid_amount = paid_amount;
	}

	public double getSurveyor_payment() {
		return surveyor_payment;
	}

	public void setSurveyor_payment(double surveyor_payment) {
		this.surveyor_payment = surveyor_payment;
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
