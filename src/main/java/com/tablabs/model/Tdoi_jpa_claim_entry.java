package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tdoi_jpa_claim_entry {
	private long jpa_claim_id;
	private long person_type_id;
	private long disable_type_id;
	private String is_nodl_jta_entry;
	private String policy_num;
	private String person_name;
	private long aadhar_num;
	private String father_husb_name;
	private String mother_wife_name;
	private long marital_type_id;
	private String communicate_addr;
	private long district_id;
	private long taluka_id;
	private long village_id;
	private long pincode;
	private long gender_id;
	private LocalDate dob_dt;
	private LocalDate accident_dt;
	private LocalDate death_disable_dt;
	private short age_on_death;
	private String accident_place;
	private long loss_cause_id;
	private short is_person_driving;
	private String drv_license_num;
	private short is_applicant_same;
	private String applicant_name;
	private long appl_aadhar_num;
	private String applicant_addr;
	private long appl_relation_id;
	private long app_district_id;
	private long app_taluka_id;
	private long app_village_id;
	private long app_pincode;
	private long app_bank_id;
	private String app_bank_name;
	private long app_branch_id;
	private String app_name_in_bank;
	private long app_bank_acc_no;
	private String bank_ifsc_code;
	private long app_mobile_no;
	private short is_nodal_same;
	private long nodal_district_id;
	private long nodal_taluka_id;
	private long nodal_village_id;
	private long nodal_pincode;
	private long scheme_id;
	private String scheme_name;
	private long deceased_reg_rel_id;
	private String nodal_officer_name;
	private double claim_amount;
	private long inward_id;
	private String inward_no;
	private LocalDate inward_dt;
	private LocalDate inward_accept_dt;
	private long claim_month_id;
	private long claim_year_id;
	private LocalDate claim_generate_dt;
	private String claim_number;
	private long claim_status_id;
	private String claim_status;
	private LocalDate claim_accept_dt;
	private long claim_accept_by_id;
	private String curr_reccomd_type;
	private String claim_entry_status;
	private short is_sent_for_pay;
	private short is_payment_done;
	private String transaction_id;
	private long cheque_num;
	private LocalDate payment_dt;
	private double paid_amount;
	private String reference_no;
	private LocalDateTime reference_dt;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;

	public Tdoi_jpa_claim_entry() {
		super();
	}

	public Tdoi_jpa_claim_entry(long jpa_claim_id, long person_type_id, long disable_type_id, String is_nodl_jta_entry,
			String policy_num, String person_name, long aadhar_num, String father_husb_name, String mother_wife_name,
			long marital_type_id, String communicate_addr, long district_id, long taluka_id, long village_id,
			long pincode, long gender_id, LocalDate dob_dt, LocalDate accident_dt, LocalDate death_disable_dt,
			short age_on_death, String accident_place, long loss_cause_id, short is_person_driving,
			String drv_license_num, short is_applicant_same, String applicant_name, long appl_aadhar_num,
			String applicant_addr, long appl_relation_id, long app_district_id, long app_taluka_id, long app_village_id,
			long app_pincode, long app_bank_id, String app_bank_name, long app_branch_id, String app_name_in_bank,
			long app_bank_acc_no, String bank_ifsc_code, long app_mobile_no, short is_nodal_same,
			long nodal_district_id, long nodal_taluka_id, long nodal_village_id, long nodal_pincode, long scheme_id,
			String scheme_name, long deceased_reg_rel_id, String nodal_officer_name, double claim_amount,
			long inward_id, String inward_no, LocalDate inward_dt, LocalDate inward_accept_dt, long claim_month_id,
			long claim_year_id, LocalDate claim_generate_dt, String claim_number, long claim_status_id,
			String claim_status, LocalDate claim_accept_dt, long claim_accept_by_id, String curr_reccomd_type,
			String claim_entry_status, short is_sent_for_pay, short is_payment_done, String transaction_id,
			long cheque_num, LocalDate payment_dt, double paid_amount, String reference_no, LocalDateTime reference_dt,
			short active_status, LocalDateTime created_date, long created_by, long created_by_post,
			LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.jpa_claim_id = jpa_claim_id;
		this.person_type_id = person_type_id;
		this.disable_type_id = disable_type_id;
		this.is_nodl_jta_entry = is_nodl_jta_entry;
		this.policy_num = policy_num;
		this.person_name = person_name;
		this.aadhar_num = aadhar_num;
		this.father_husb_name = father_husb_name;
		this.mother_wife_name = mother_wife_name;
		this.marital_type_id = marital_type_id;
		this.communicate_addr = communicate_addr;
		this.district_id = district_id;
		this.taluka_id = taluka_id;
		this.village_id = village_id;
		this.pincode = pincode;
		this.gender_id = gender_id;
		this.dob_dt = dob_dt;
		this.accident_dt = accident_dt;
		this.death_disable_dt = death_disable_dt;
		this.age_on_death = age_on_death;
		this.accident_place = accident_place;
		this.loss_cause_id = loss_cause_id;
		this.is_person_driving = is_person_driving;
		this.drv_license_num = drv_license_num;
		this.is_applicant_same = is_applicant_same;
		this.applicant_name = applicant_name;
		this.appl_aadhar_num = appl_aadhar_num;
		this.applicant_addr = applicant_addr;
		this.appl_relation_id = appl_relation_id;
		this.app_district_id = app_district_id;
		this.app_taluka_id = app_taluka_id;
		this.app_village_id = app_village_id;
		this.app_pincode = app_pincode;
		this.app_bank_id = app_bank_id;
		this.app_bank_name = app_bank_name;
		this.app_branch_id = app_branch_id;
		this.app_name_in_bank = app_name_in_bank;
		this.app_bank_acc_no = app_bank_acc_no;
		this.bank_ifsc_code = bank_ifsc_code;
		this.app_mobile_no = app_mobile_no;
		this.is_nodal_same = is_nodal_same;
		this.nodal_district_id = nodal_district_id;
		this.nodal_taluka_id = nodal_taluka_id;
		this.nodal_village_id = nodal_village_id;
		this.nodal_pincode = nodal_pincode;
		this.scheme_id = scheme_id;
		this.scheme_name = scheme_name;
		this.deceased_reg_rel_id = deceased_reg_rel_id;
		this.nodal_officer_name = nodal_officer_name;
		this.claim_amount = claim_amount;
		this.inward_id = inward_id;
		this.inward_no = inward_no;
		this.inward_dt = inward_dt;
		this.inward_accept_dt = inward_accept_dt;
		this.claim_month_id = claim_month_id;
		this.claim_year_id = claim_year_id;
		this.claim_generate_dt = claim_generate_dt;
		this.claim_number = claim_number;
		this.claim_status_id = claim_status_id;
		this.claim_status = claim_status;
		this.claim_accept_dt = claim_accept_dt;
		this.claim_accept_by_id = claim_accept_by_id;
		this.curr_reccomd_type = curr_reccomd_type;
		this.claim_entry_status = claim_entry_status;
		this.is_sent_for_pay = is_sent_for_pay;
		this.is_payment_done = is_payment_done;
		this.transaction_id = transaction_id;
		this.cheque_num = cheque_num;
		this.payment_dt = payment_dt;
		this.paid_amount = paid_amount;
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

	public long getJpa_claim_id() {
		return jpa_claim_id;
	}

	public void setJpa_claim_id(long jpa_claim_id) {
		this.jpa_claim_id = jpa_claim_id;
	}

	public long getPerson_type_id() {
		return person_type_id;
	}

	public void setPerson_type_id(long person_type_id) {
		this.person_type_id = person_type_id;
	}

	public long getDisable_type_id() {
		return disable_type_id;
	}

	public void setDisable_type_id(long disable_type_id) {
		this.disable_type_id = disable_type_id;
	}

	public String getIs_nodl_jta_entry() {
		return is_nodl_jta_entry;
	}

	public void setIs_nodl_jta_entry(String is_nodl_jta_entry) {
		this.is_nodl_jta_entry = is_nodl_jta_entry;
	}

	public String getPolicy_num() {
		return policy_num;
	}

	public void setPolicy_num(String policy_num) {
		this.policy_num = policy_num;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public long getAadhar_num() {
		return aadhar_num;
	}

	public void setAadhar_num(long aadhar_num) {
		this.aadhar_num = aadhar_num;
	}

	public String getFather_husb_name() {
		return father_husb_name;
	}

	public void setFather_husb_name(String father_husb_name) {
		this.father_husb_name = father_husb_name;
	}

	public String getMother_wife_name() {
		return mother_wife_name;
	}

	public void setMother_wife_name(String mother_wife_name) {
		this.mother_wife_name = mother_wife_name;
	}

	public long getMarital_type_id() {
		return marital_type_id;
	}

	public void setMarital_type_id(long marital_type_id) {
		this.marital_type_id = marital_type_id;
	}

	public String getCommunicate_addr() {
		return communicate_addr;
	}

	public void setCommunicate_addr(String communicate_addr) {
		this.communicate_addr = communicate_addr;
	}

	public long getDistrict_id() {
		return district_id;
	}

	public void setDistrict_id(long district_id) {
		this.district_id = district_id;
	}

	public long getTaluka_id() {
		return taluka_id;
	}

	public void setTaluka_id(long taluka_id) {
		this.taluka_id = taluka_id;
	}

	public long getVillage_id() {
		return village_id;
	}

	public void setVillage_id(long village_id) {
		this.village_id = village_id;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getGender_id() {
		return gender_id;
	}

	public void setGender_id(long gender_id) {
		this.gender_id = gender_id;
	}

	public LocalDate getDob_dt() {
		return dob_dt;
	}

	public void setDob_dt(LocalDate dob_dt) {
		this.dob_dt = dob_dt;
	}

	public LocalDate getAccident_dt() {
		return accident_dt;
	}

	public void setAccident_dt(LocalDate accident_dt) {
		this.accident_dt = accident_dt;
	}

	public LocalDate getDeath_disable_dt() {
		return death_disable_dt;
	}

	public void setDeath_disable_dt(LocalDate death_disable_dt) {
		this.death_disable_dt = death_disable_dt;
	}

	public short getAge_on_death() {
		return age_on_death;
	}

	public void setAge_on_death(short age_on_death) {
		this.age_on_death = age_on_death;
	}

	public String getAccident_place() {
		return accident_place;
	}

	public void setAccident_place(String accident_place) {
		this.accident_place = accident_place;
	}

	public long getLoss_cause_id() {
		return loss_cause_id;
	}

	public void setLoss_cause_id(long loss_cause_id) {
		this.loss_cause_id = loss_cause_id;
	}

	public short getIs_person_driving() {
		return is_person_driving;
	}

	public void setIs_person_driving(short is_person_driving) {
		this.is_person_driving = is_person_driving;
	}

	public String getDrv_license_num() {
		return drv_license_num;
	}

	public void setDrv_license_num(String drv_license_num) {
		this.drv_license_num = drv_license_num;
	}

	public short getIs_applicant_same() {
		return is_applicant_same;
	}

	public void setIs_applicant_same(short is_applicant_same) {
		this.is_applicant_same = is_applicant_same;
	}

	public String getApplicant_name() {
		return applicant_name;
	}

	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}

	public long getAppl_aadhar_num() {
		return appl_aadhar_num;
	}

	public void setAppl_aadhar_num(long appl_aadhar_num) {
		this.appl_aadhar_num = appl_aadhar_num;
	}

	public String getApplicant_addr() {
		return applicant_addr;
	}

	public void setApplicant_addr(String applicant_addr) {
		this.applicant_addr = applicant_addr;
	}

	public long getAppl_relation_id() {
		return appl_relation_id;
	}

	public void setAppl_relation_id(long appl_relation_id) {
		this.appl_relation_id = appl_relation_id;
	}

	public long getApp_district_id() {
		return app_district_id;
	}

	public void setApp_district_id(long app_district_id) {
		this.app_district_id = app_district_id;
	}

	public long getApp_taluka_id() {
		return app_taluka_id;
	}

	public void setApp_taluka_id(long app_taluka_id) {
		this.app_taluka_id = app_taluka_id;
	}

	public long getApp_village_id() {
		return app_village_id;
	}

	public void setApp_village_id(long app_village_id) {
		this.app_village_id = app_village_id;
	}

	public long getApp_pincode() {
		return app_pincode;
	}

	public void setApp_pincode(long app_pincode) {
		this.app_pincode = app_pincode;
	}

	public long getApp_bank_id() {
		return app_bank_id;
	}

	public void setApp_bank_id(long app_bank_id) {
		this.app_bank_id = app_bank_id;
	}

	public String getApp_bank_name() {
		return app_bank_name;
	}

	public void setApp_bank_name(String app_bank_name) {
		this.app_bank_name = app_bank_name;
	}

	public long getApp_branch_id() {
		return app_branch_id;
	}

	public void setApp_branch_id(long app_branch_id) {
		this.app_branch_id = app_branch_id;
	}

	public String getApp_name_in_bank() {
		return app_name_in_bank;
	}

	public void setApp_name_in_bank(String app_name_in_bank) {
		this.app_name_in_bank = app_name_in_bank;
	}

	public long getApp_bank_acc_no() {
		return app_bank_acc_no;
	}

	public void setApp_bank_acc_no(long app_bank_acc_no) {
		this.app_bank_acc_no = app_bank_acc_no;
	}

	public String getBank_ifsc_code() {
		return bank_ifsc_code;
	}

	public void setBank_ifsc_code(String bank_ifsc_code) {
		this.bank_ifsc_code = bank_ifsc_code;
	}

	public long getApp_mobile_no() {
		return app_mobile_no;
	}

	public void setApp_mobile_no(long app_mobile_no) {
		this.app_mobile_no = app_mobile_no;
	}

	public short getIs_nodal_same() {
		return is_nodal_same;
	}

	public void setIs_nodal_same(short is_nodal_same) {
		this.is_nodal_same = is_nodal_same;
	}

	public long getNodal_district_id() {
		return nodal_district_id;
	}

	public void setNodal_district_id(long nodal_district_id) {
		this.nodal_district_id = nodal_district_id;
	}

	public long getNodal_taluka_id() {
		return nodal_taluka_id;
	}

	public void setNodal_taluka_id(long nodal_taluka_id) {
		this.nodal_taluka_id = nodal_taluka_id;
	}

	public long getNodal_village_id() {
		return nodal_village_id;
	}

	public void setNodal_village_id(long nodal_village_id) {
		this.nodal_village_id = nodal_village_id;
	}

	public long getNodal_pincode() {
		return nodal_pincode;
	}

	public void setNodal_pincode(long nodal_pincode) {
		this.nodal_pincode = nodal_pincode;
	}

	public long getScheme_id() {
		return scheme_id;
	}

	public void setScheme_id(long scheme_id) {
		this.scheme_id = scheme_id;
	}

	public String getScheme_name() {
		return scheme_name;
	}

	public void setScheme_name(String scheme_name) {
		this.scheme_name = scheme_name;
	}

	public long getDeceased_reg_rel_id() {
		return deceased_reg_rel_id;
	}

	public void setDeceased_reg_rel_id(long deceased_reg_rel_id) {
		this.deceased_reg_rel_id = deceased_reg_rel_id;
	}

	public String getNodal_officer_name() {
		return nodal_officer_name;
	}

	public void setNodal_officer_name(String nodal_officer_name) {
		this.nodal_officer_name = nodal_officer_name;
	}

	public double getClaim_amount() {
		return claim_amount;
	}

	public void setClaim_amount(double claim_amount) {
		this.claim_amount = claim_amount;
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

	public LocalDate getClaim_generate_dt() {
		return claim_generate_dt;
	}

	public void setClaim_generate_dt(LocalDate claim_generate_dt) {
		this.claim_generate_dt = claim_generate_dt;
	}

	public String getClaim_number() {
		return claim_number;
	}

	public void setClaim_number(String claim_number) {
		this.claim_number = claim_number;
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

	public String getCurr_reccomd_type() {
		return curr_reccomd_type;
	}

	public void setCurr_reccomd_type(String curr_reccomd_type) {
		this.curr_reccomd_type = curr_reccomd_type;
	}

	public String getClaim_entry_status() {
		return claim_entry_status;
	}

	public void setClaim_entry_status(String claim_entry_status) {
		this.claim_entry_status = claim_entry_status;
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
