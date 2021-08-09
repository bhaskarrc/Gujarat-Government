package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tdoi_hba_proposal {
	private long hba_proposal_id;
	private long dppf_taken_loan;
	private String loan_account_no;
	private double loan_amount;
	private String employee_no;
	private String employee_name;
	private String designation;
	private String office_name;
	private String office_address;
	private String house_address;
	private String house_no;
	private String survey_no;
	private long district_id;
	private long taluka_id;
	private long village_id;
	private long pincode;
	private long aadhar_num;
	private long mobile_num;
	private long house_type_id;
	private long wall_type_id;
	private long ceiling_type_id;
	private double sum_insured;
	private short term_ins_yrs;
	private double insrnc_premium;
	private long payment_mode_id;
	private String cheque_dd_no;
	private LocalDate cheque_dd_dt;
	private long bank_id;
	private String bank_name;
	private long branch_id;
	private String branch_name;
	private String challan_no;
	private LocalDate challan_dt;
	private double challan_amount;
	private String btr5_receipt_no;
	private LocalDate btr5_receipt_dt;
	private long policy_type_id;
	private String policy_no;
	private LocalDate policy_genr_dt;
	private String policy_genr_by;
	private String policy_refrence_no;
	private String endorsement_no;
	private LocalDate policy_start_dt;
	private LocalDate policy_end_dt;
	private LocalDate policy_renew_dt;
	private long risk_covered_id;
	private String reference_no;
	private LocalDateTime reference_dt;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;
	private String is_terrorism_aoc;
	private double terror_sum_assurd;
	private int terror_ins_term;
	private double terror_rate;
	private double terror_ins_prem;
	private String is_earthquake_aoc;
	private double earthq_sum_assurd;
	private int earthq_ins_term;
	private double earthq_rate;
	private double earthq_ins_prem;
	private String other_aoc_desc;
	private double premium_roi;
	private double prem_disc_pc;
	private double prem_disc_amt;
	private double loading_chrg_amt;
	private double tot_addon_prem;
	private double tot_prem_amt;
	private double prem_gst_pc;
	private double prem_gst_amt;
	private double payable_prem_amt;

	public Tdoi_hba_proposal() {
		super();
	}

	public Tdoi_hba_proposal(long hba_proposal_id, long dppf_taken_loan, String loan_account_no, double loan_amount,
			String employee_no, String employee_name, String designation, String office_name, String office_address,
			String house_address, String house_no, String survey_no, long district_id, long taluka_id, long village_id,
			long pincode, long aadhar_num, long mobile_num, long house_type_id, long wall_type_id, long ceiling_type_id,
			double sum_insured, short term_ins_yrs, double insrnc_premium, long payment_mode_id, String cheque_dd_no,
			LocalDate cheque_dd_dt, long bank_id, String bank_name, long branch_id, String branch_name,
			String challan_no, LocalDate challan_dt, double challan_amount, String btr5_receipt_no,
			LocalDate btr5_receipt_dt, long policy_type_id, String policy_no, LocalDate policy_genr_dt,
			String policy_genr_by, String policy_refrence_no, String endorsement_no, LocalDate policy_start_dt,
			LocalDate policy_end_dt, LocalDate policy_renew_dt, long risk_covered_id, String reference_no,
			LocalDateTime reference_dt, short active_status, LocalDateTime created_date, long created_by,
			long created_by_post, LocalDateTime updated_date, long updated_by, long updated_by_post,
			String is_terrorism_aoc, double terror_sum_assurd, int terror_ins_term, double terror_rate,
			double terror_ins_prem, String is_earthquake_aoc, double earthq_sum_assurd, int earthq_ins_term,
			double earthq_rate, double earthq_ins_prem, String other_aoc_desc, double premium_roi, double prem_disc_pc,
			double prem_disc_amt, double loading_chrg_amt, double tot_addon_prem, double tot_prem_amt,
			double prem_gst_pc, double prem_gst_amt, double payable_prem_amt) {
		super();
		this.hba_proposal_id = hba_proposal_id;
		this.dppf_taken_loan = dppf_taken_loan;
		this.loan_account_no = loan_account_no;
		this.loan_amount = loan_amount;
		this.employee_no = employee_no;
		this.employee_name = employee_name;
		this.designation = designation;
		this.office_name = office_name;
		this.office_address = office_address;
		this.house_address = house_address;
		this.house_no = house_no;
		this.survey_no = survey_no;
		this.district_id = district_id;
		this.taluka_id = taluka_id;
		this.village_id = village_id;
		this.pincode = pincode;
		this.aadhar_num = aadhar_num;
		this.mobile_num = mobile_num;
		this.house_type_id = house_type_id;
		this.wall_type_id = wall_type_id;
		this.ceiling_type_id = ceiling_type_id;
		this.sum_insured = sum_insured;
		this.term_ins_yrs = term_ins_yrs;
		this.insrnc_premium = insrnc_premium;
		this.payment_mode_id = payment_mode_id;
		this.cheque_dd_no = cheque_dd_no;
		this.cheque_dd_dt = cheque_dd_dt;
		this.bank_id = bank_id;
		this.bank_name = bank_name;
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.challan_no = challan_no;
		this.challan_dt = challan_dt;
		this.challan_amount = challan_amount;
		this.btr5_receipt_no = btr5_receipt_no;
		this.btr5_receipt_dt = btr5_receipt_dt;
		this.policy_type_id = policy_type_id;
		this.policy_no = policy_no;
		this.policy_genr_dt = policy_genr_dt;
		this.policy_genr_by = policy_genr_by;
		this.policy_refrence_no = policy_refrence_no;
		this.endorsement_no = endorsement_no;
		this.policy_start_dt = policy_start_dt;
		this.policy_end_dt = policy_end_dt;
		this.policy_renew_dt = policy_renew_dt;
		this.risk_covered_id = risk_covered_id;
		this.reference_no = reference_no;
		this.reference_dt = reference_dt;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
		this.is_terrorism_aoc = is_terrorism_aoc;
		this.terror_sum_assurd = terror_sum_assurd;
		this.terror_ins_term = terror_ins_term;
		this.terror_rate = terror_rate;
		this.terror_ins_prem = terror_ins_prem;
		this.is_earthquake_aoc = is_earthquake_aoc;
		this.earthq_sum_assurd = earthq_sum_assurd;
		this.earthq_ins_term = earthq_ins_term;
		this.earthq_rate = earthq_rate;
		this.earthq_ins_prem = earthq_ins_prem;
		this.other_aoc_desc = other_aoc_desc;
		this.premium_roi = premium_roi;
		this.prem_disc_pc = prem_disc_pc;
		this.prem_disc_amt = prem_disc_amt;
		this.loading_chrg_amt = loading_chrg_amt;
		this.tot_addon_prem = tot_addon_prem;
		this.tot_prem_amt = tot_prem_amt;
		this.prem_gst_pc = prem_gst_pc;
		this.prem_gst_amt = prem_gst_amt;
		this.payable_prem_amt = payable_prem_amt;
	}

	public long getHba_proposal_id() {
		return hba_proposal_id;
	}

	public void setHba_proposal_id(long hba_proposal_id) {
		this.hba_proposal_id = hba_proposal_id;
	}

	public long getDppf_taken_loan() {
		return dppf_taken_loan;
	}

	public void setDppf_taken_loan(long dppf_taken_loan) {
		this.dppf_taken_loan = dppf_taken_loan;
	}

	public String getLoan_account_no() {
		return loan_account_no;
	}

	public void setLoan_account_no(String loan_account_no) {
		this.loan_account_no = loan_account_no;
	}

	public double getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(double loan_amount) {
		this.loan_amount = loan_amount;
	}

	public String getEmployee_no() {
		return employee_no;
	}

	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getOffice_name() {
		return office_name;
	}

	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}

	public String getOffice_address() {
		return office_address;
	}

	public void setOffice_address(String office_address) {
		this.office_address = office_address;
	}

	public String getHouse_address() {
		return house_address;
	}

	public void setHouse_address(String house_address) {
		this.house_address = house_address;
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getSurvey_no() {
		return survey_no;
	}

	public void setSurvey_no(String survey_no) {
		this.survey_no = survey_no;
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

	public long getHouse_type_id() {
		return house_type_id;
	}

	public void setHouse_type_id(long house_type_id) {
		this.house_type_id = house_type_id;
	}

	public long getWall_type_id() {
		return wall_type_id;
	}

	public void setWall_type_id(long wall_type_id) {
		this.wall_type_id = wall_type_id;
	}

	public long getCeiling_type_id() {
		return ceiling_type_id;
	}

	public void setCeiling_type_id(long ceiling_type_id) {
		this.ceiling_type_id = ceiling_type_id;
	}

	public double getSum_insured() {
		return sum_insured;
	}

	public void setSum_insured(double sum_insured) {
		this.sum_insured = sum_insured;
	}

	public short getTerm_ins_yrs() {
		return term_ins_yrs;
	}

	public void setTerm_ins_yrs(short term_ins_yrs) {
		this.term_ins_yrs = term_ins_yrs;
	}

	public double getInsrnc_premium() {
		return insrnc_premium;
	}

	public void setInsrnc_premium(double insrnc_premium) {
		this.insrnc_premium = insrnc_premium;
	}

	public long getPayment_mode_id() {
		return payment_mode_id;
	}

	public void setPayment_mode_id(long payment_mode_id) {
		this.payment_mode_id = payment_mode_id;
	}

	public String getCheque_dd_no() {
		return cheque_dd_no;
	}

	public void setCheque_dd_no(String cheque_dd_no) {
		this.cheque_dd_no = cheque_dd_no;
	}

	public LocalDate getCheque_dd_dt() {
		return cheque_dd_dt;
	}

	public void setCheque_dd_dt(LocalDate cheque_dd_dt) {
		this.cheque_dd_dt = cheque_dd_dt;
	}

	public long getBank_id() {
		return bank_id;
	}

	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public long getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(long branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getChallan_no() {
		return challan_no;
	}

	public void setChallan_no(String challan_no) {
		this.challan_no = challan_no;
	}

	public LocalDate getChallan_dt() {
		return challan_dt;
	}

	public void setChallan_dt(LocalDate challan_dt) {
		this.challan_dt = challan_dt;
	}

	public double getChallan_amount() {
		return challan_amount;
	}

	public void setChallan_amount(double challan_amount) {
		this.challan_amount = challan_amount;
	}

	public String getBtr5_receipt_no() {
		return btr5_receipt_no;
	}

	public void setBtr5_receipt_no(String btr5_receipt_no) {
		this.btr5_receipt_no = btr5_receipt_no;
	}

	public LocalDate getBtr5_receipt_dt() {
		return btr5_receipt_dt;
	}

	public void setBtr5_receipt_dt(LocalDate btr5_receipt_dt) {
		this.btr5_receipt_dt = btr5_receipt_dt;
	}

	public long getPolicy_type_id() {
		return policy_type_id;
	}

	public void setPolicy_type_id(long policy_type_id) {
		this.policy_type_id = policy_type_id;
	}

	public String getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}

	public LocalDate getPolicy_genr_dt() {
		return policy_genr_dt;
	}

	public void setPolicy_genr_dt(LocalDate policy_genr_dt) {
		this.policy_genr_dt = policy_genr_dt;
	}

	public String getPolicy_genr_by() {
		return policy_genr_by;
	}

	public void setPolicy_genr_by(String policy_genr_by) {
		this.policy_genr_by = policy_genr_by;
	}

	public String getPolicy_refrence_no() {
		return policy_refrence_no;
	}

	public void setPolicy_refrence_no(String policy_refrence_no) {
		this.policy_refrence_no = policy_refrence_no;
	}

	public String getEndorsement_no() {
		return endorsement_no;
	}

	public void setEndorsement_no(String endorsement_no) {
		this.endorsement_no = endorsement_no;
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

	public LocalDate getPolicy_renew_dt() {
		return policy_renew_dt;
	}

	public void setPolicy_renew_dt(LocalDate policy_renew_dt) {
		this.policy_renew_dt = policy_renew_dt;
	}

	public long getRisk_covered_id() {
		return risk_covered_id;
	}

	public void setRisk_covered_id(long risk_covered_id) {
		this.risk_covered_id = risk_covered_id;
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

	public String getIs_terrorism_aoc() {
		return is_terrorism_aoc;
	}

	public void setIs_terrorism_aoc(String is_terrorism_aoc) {
		this.is_terrorism_aoc = is_terrorism_aoc;
	}

	public double getTerror_sum_assurd() {
		return terror_sum_assurd;
	}

	public void setTerror_sum_assurd(double terror_sum_assurd) {
		this.terror_sum_assurd = terror_sum_assurd;
	}

	public int getTerror_ins_term() {
		return terror_ins_term;
	}

	public void setTerror_ins_term(int terror_ins_term) {
		this.terror_ins_term = terror_ins_term;
	}

	public double getTerror_rate() {
		return terror_rate;
	}

	public void setTerror_rate(double terror_rate) {
		this.terror_rate = terror_rate;
	}

	public double getTerror_ins_prem() {
		return terror_ins_prem;
	}

	public void setTerror_ins_prem(double terror_ins_prem) {
		this.terror_ins_prem = terror_ins_prem;
	}

	public String getIs_earthquake_aoc() {
		return is_earthquake_aoc;
	}

	public void setIs_earthquake_aoc(String is_earthquake_aoc) {
		this.is_earthquake_aoc = is_earthquake_aoc;
	}

	public double getEarthq_sum_assurd() {
		return earthq_sum_assurd;
	}

	public void setEarthq_sum_assurd(double earthq_sum_assurd) {
		this.earthq_sum_assurd = earthq_sum_assurd;
	}

	public int getEarthq_ins_term() {
		return earthq_ins_term;
	}

	public void setEarthq_ins_term(int earthq_ins_term) {
		this.earthq_ins_term = earthq_ins_term;
	}

	public double getEarthq_rate() {
		return earthq_rate;
	}

	public void setEarthq_rate(double earthq_rate) {
		this.earthq_rate = earthq_rate;
	}

	public double getEarthq_ins_prem() {
		return earthq_ins_prem;
	}

	public void setEarthq_ins_prem(double earthq_ins_prem) {
		this.earthq_ins_prem = earthq_ins_prem;
	}

	public String getOther_aoc_desc() {
		return other_aoc_desc;
	}

	public void setOther_aoc_desc(String other_aoc_desc) {
		this.other_aoc_desc = other_aoc_desc;
	}

	public double getPremium_roi() {
		return premium_roi;
	}

	public void setPremium_roi(double premium_roi) {
		this.premium_roi = premium_roi;
	}

	public double getPrem_disc_pc() {
		return prem_disc_pc;
	}

	public void setPrem_disc_pc(double prem_disc_pc) {
		this.prem_disc_pc = prem_disc_pc;
	}

	public double getPrem_disc_amt() {
		return prem_disc_amt;
	}

	public void setPrem_disc_amt(double prem_disc_amt) {
		this.prem_disc_amt = prem_disc_amt;
	}

	public double getLoading_chrg_amt() {
		return loading_chrg_amt;
	}

	public void setLoading_chrg_amt(double loading_chrg_amt) {
		this.loading_chrg_amt = loading_chrg_amt;
	}

	public double getTot_addon_prem() {
		return tot_addon_prem;
	}

	public void setTot_addon_prem(double tot_addon_prem) {
		this.tot_addon_prem = tot_addon_prem;
	}

	public double getTot_prem_amt() {
		return tot_prem_amt;
	}

	public void setTot_prem_amt(double tot_prem_amt) {
		this.tot_prem_amt = tot_prem_amt;
	}

	public double getPrem_gst_pc() {
		return prem_gst_pc;
	}

	public void setPrem_gst_pc(double prem_gst_pc) {
		this.prem_gst_pc = prem_gst_pc;
	}

	public double getPrem_gst_amt() {
		return prem_gst_amt;
	}

	public void setPrem_gst_amt(double prem_gst_amt) {
		this.prem_gst_amt = prem_gst_amt;
	}

	public double getPayable_prem_amt() {
		return payable_prem_amt;
	}

	public void setPayable_prem_amt(double payable_prem_amt) {
		this.payable_prem_amt = payable_prem_amt;
	}

}
