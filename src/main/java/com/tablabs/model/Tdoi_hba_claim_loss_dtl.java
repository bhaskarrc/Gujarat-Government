package com.tablabs.model;

import java.time.LocalDateTime;

public class Tdoi_hba_claim_loss_dtl {
	private long loss_dtl_id;
	private long hba_claim_id;
	private short item_num_srno;
	private String item_desc;
	private double item_actual_value;
	private double loss_time_value;
	private double ded_salvage_value;
	private double claimed_amount;
	private short active_status;
	private LocalDateTime created_date;
	private long created_by;
	private long created_by_post;
	private LocalDateTime updated_date;
	private long updated_by;
	private long updated_by_post;

	public Tdoi_hba_claim_loss_dtl() {
		super();
	}

	public Tdoi_hba_claim_loss_dtl(long loss_dtl_id, long hba_claim_id, short item_num_srno, String item_desc,
			double item_actual_value, double loss_time_value, double ded_salvage_value, double claimed_amount,
			short active_status, LocalDateTime created_date, long created_by, long created_by_post,
			LocalDateTime updated_date, long updated_by, long updated_by_post) {
		super();
		this.loss_dtl_id = loss_dtl_id;
		this.hba_claim_id = hba_claim_id;
		this.item_num_srno = item_num_srno;
		this.item_desc = item_desc;
		this.item_actual_value = item_actual_value;
		this.loss_time_value = loss_time_value;
		this.ded_salvage_value = ded_salvage_value;
		this.claimed_amount = claimed_amount;
		this.active_status = active_status;
		this.created_date = created_date;
		this.created_by = created_by;
		this.created_by_post = created_by_post;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.updated_by_post = updated_by_post;
	}

	public long getLoss_dtl_id() {
		return loss_dtl_id;
	}

	public void setLoss_dtl_id(long loss_dtl_id) {
		this.loss_dtl_id = loss_dtl_id;
	}

	public long getHba_claim_id() {
		return hba_claim_id;
	}

	public void setHba_claim_id(long hba_claim_id) {
		this.hba_claim_id = hba_claim_id;
	}

	public short getItem_num_srno() {
		return item_num_srno;
	}

	public void setItem_num_srno(short item_num_srno) {
		this.item_num_srno = item_num_srno;
	}

	public String getItem_desc() {
		return item_desc;
	}

	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}

	public double getItem_actual_value() {
		return item_actual_value;
	}

	public void setItem_actual_value(double item_actual_value) {
		this.item_actual_value = item_actual_value;
	}

	public double getLoss_time_value() {
		return loss_time_value;
	}

	public void setLoss_time_value(double loss_time_value) {
		this.loss_time_value = loss_time_value;
	}

	public double getDed_salvage_value() {
		return ded_salvage_value;
	}

	public void setDed_salvage_value(double ded_salvage_value) {
		this.ded_salvage_value = ded_salvage_value;
	}

	public double getClaimed_amount() {
		return claimed_amount;
	}

	public void setClaimed_amount(double claimed_amount) {
		this.claimed_amount = claimed_amount;
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
