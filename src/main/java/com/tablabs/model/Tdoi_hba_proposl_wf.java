package com.tablabs.model;

import java.time.LocalDateTime;

public class Tdoi_hba_proposl_wf {
	private long hba_proposl_wf_id;
	private long trn_id;
	private long actionconfig_id;
	private long wf_action_id;
	private long assign_to_wf_role_id;
	private long assign_to_user_id;
	private long assign_to_post_id;
	private long assign_to_pou_id;
	private long assign_to_office_id;
	private long assign_to_branch_id;
	private long assign_to_group_id;
	private String wf_status;
	private String trn_status;
	private long assign_by_wf_role_id;
	private long assign_by_user_id;
	private long assign_by_post_id;
	private long assign_by_pou_id;
	private long assign_by_office_id;
	private long assign_by_branch_id;
	private long assign_by_group_id;
	private String remarks;
	private short send_back_flag;
	private short counter;
	private short sub_counter;
	private short level;
	private short ref_col_smallint;
	private String ref_col_varchar;
	private String ref_col_other;
	private long created_by;
	private LocalDateTime created_date;
	private long created_by_post;
	private long updated_by;
	private LocalDateTime updated_date;
	private long updated_by_post;
	private short active_status;

	public Tdoi_hba_proposl_wf() {
		super();
	}

	public Tdoi_hba_proposl_wf(long hba_proposl_wf_id, long trn_id, long actionconfig_id, long wf_action_id,
			long assign_to_wf_role_id, long assign_to_user_id, long assign_to_post_id, long assign_to_pou_id,
			long assign_to_office_id, long assign_to_branch_id, long assign_to_group_id, String wf_status,
			String trn_status, long assign_by_wf_role_id, long assign_by_user_id, long assign_by_post_id,
			long assign_by_pou_id, long assign_by_office_id, long assign_by_branch_id, long assign_by_group_id,
			String remarks, short send_back_flag, short counter, short sub_counter, short level, short ref_col_smallint,
			String ref_col_varchar, String ref_col_other, long created_by, LocalDateTime created_date,
			long created_by_post, long updated_by, LocalDateTime updated_date, long updated_by_post,
			short active_status) {
		super();
		this.hba_proposl_wf_id = hba_proposl_wf_id;
		this.trn_id = trn_id;
		this.actionconfig_id = actionconfig_id;
		this.wf_action_id = wf_action_id;
		this.assign_to_wf_role_id = assign_to_wf_role_id;
		this.assign_to_user_id = assign_to_user_id;
		this.assign_to_post_id = assign_to_post_id;
		this.assign_to_pou_id = assign_to_pou_id;
		this.assign_to_office_id = assign_to_office_id;
		this.assign_to_branch_id = assign_to_branch_id;
		this.assign_to_group_id = assign_to_group_id;
		this.wf_status = wf_status;
		this.trn_status = trn_status;
		this.assign_by_wf_role_id = assign_by_wf_role_id;
		this.assign_by_user_id = assign_by_user_id;
		this.assign_by_post_id = assign_by_post_id;
		this.assign_by_pou_id = assign_by_pou_id;
		this.assign_by_office_id = assign_by_office_id;
		this.assign_by_branch_id = assign_by_branch_id;
		this.assign_by_group_id = assign_by_group_id;
		this.remarks = remarks;
		this.send_back_flag = send_back_flag;
		this.counter = counter;
		this.sub_counter = sub_counter;
		this.level = level;
		this.ref_col_smallint = ref_col_smallint;
		this.ref_col_varchar = ref_col_varchar;
		this.ref_col_other = ref_col_other;
		this.created_by = created_by;
		this.created_date = created_date;
		this.created_by_post = created_by_post;
		this.updated_by = updated_by;
		this.updated_date = updated_date;
		this.updated_by_post = updated_by_post;
		this.active_status = active_status;
	}

	public long getHba_proposl_wf_id() {
		return hba_proposl_wf_id;
	}

	public void setHba_proposl_wf_id(long hba_proposl_wf_id) {
		this.hba_proposl_wf_id = hba_proposl_wf_id;
	}

	public long getTrn_id() {
		return trn_id;
	}

	public void setTrn_id(long trn_id) {
		this.trn_id = trn_id;
	}

	public long getActionconfig_id() {
		return actionconfig_id;
	}

	public void setActionconfig_id(long actionconfig_id) {
		this.actionconfig_id = actionconfig_id;
	}

	public long getWf_action_id() {
		return wf_action_id;
	}

	public void setWf_action_id(long wf_action_id) {
		this.wf_action_id = wf_action_id;
	}

	public long getAssign_to_wf_role_id() {
		return assign_to_wf_role_id;
	}

	public void setAssign_to_wf_role_id(long assign_to_wf_role_id) {
		this.assign_to_wf_role_id = assign_to_wf_role_id;
	}

	public long getAssign_to_user_id() {
		return assign_to_user_id;
	}

	public void setAssign_to_user_id(long assign_to_user_id) {
		this.assign_to_user_id = assign_to_user_id;
	}

	public long getAssign_to_post_id() {
		return assign_to_post_id;
	}

	public void setAssign_to_post_id(long assign_to_post_id) {
		this.assign_to_post_id = assign_to_post_id;
	}

	public long getAssign_to_pou_id() {
		return assign_to_pou_id;
	}

	public void setAssign_to_pou_id(long assign_to_pou_id) {
		this.assign_to_pou_id = assign_to_pou_id;
	}

	public long getAssign_to_office_id() {
		return assign_to_office_id;
	}

	public void setAssign_to_office_id(long assign_to_office_id) {
		this.assign_to_office_id = assign_to_office_id;
	}

	public long getAssign_to_branch_id() {
		return assign_to_branch_id;
	}

	public void setAssign_to_branch_id(long assign_to_branch_id) {
		this.assign_to_branch_id = assign_to_branch_id;
	}

	public long getAssign_to_group_id() {
		return assign_to_group_id;
	}

	public void setAssign_to_group_id(long assign_to_group_id) {
		this.assign_to_group_id = assign_to_group_id;
	}

	public String getWf_status() {
		return wf_status;
	}

	public void setWf_status(String wf_status) {
		this.wf_status = wf_status;
	}

	public String getTrn_status() {
		return trn_status;
	}

	public void setTrn_status(String trn_status) {
		this.trn_status = trn_status;
	}

	public long getAssign_by_wf_role_id() {
		return assign_by_wf_role_id;
	}

	public void setAssign_by_wf_role_id(long assign_by_wf_role_id) {
		this.assign_by_wf_role_id = assign_by_wf_role_id;
	}

	public long getAssign_by_user_id() {
		return assign_by_user_id;
	}

	public void setAssign_by_user_id(long assign_by_user_id) {
		this.assign_by_user_id = assign_by_user_id;
	}

	public long getAssign_by_post_id() {
		return assign_by_post_id;
	}

	public void setAssign_by_post_id(long assign_by_post_id) {
		this.assign_by_post_id = assign_by_post_id;
	}

	public long getAssign_by_pou_id() {
		return assign_by_pou_id;
	}

	public void setAssign_by_pou_id(long assign_by_pou_id) {
		this.assign_by_pou_id = assign_by_pou_id;
	}

	public long getAssign_by_office_id() {
		return assign_by_office_id;
	}

	public void setAssign_by_office_id(long assign_by_office_id) {
		this.assign_by_office_id = assign_by_office_id;
	}

	public long getAssign_by_branch_id() {
		return assign_by_branch_id;
	}

	public void setAssign_by_branch_id(long assign_by_branch_id) {
		this.assign_by_branch_id = assign_by_branch_id;
	}

	public long getAssign_by_group_id() {
		return assign_by_group_id;
	}

	public void setAssign_by_group_id(long assign_by_group_id) {
		this.assign_by_group_id = assign_by_group_id;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public short getSend_back_flag() {
		return send_back_flag;
	}

	public void setSend_back_flag(short send_back_flag) {
		this.send_back_flag = send_back_flag;
	}

	public short getCounter() {
		return counter;
	}

	public void setCounter(short counter) {
		this.counter = counter;
	}

	public short getSub_counter() {
		return sub_counter;
	}

	public void setSub_counter(short sub_counter) {
		this.sub_counter = sub_counter;
	}

	public short getLevel() {
		return level;
	}

	public void setLevel(short level) {
		this.level = level;
	}

	public short getRef_col_smallint() {
		return ref_col_smallint;
	}

	public void setRef_col_smallint(short ref_col_smallint) {
		this.ref_col_smallint = ref_col_smallint;
	}

	public String getRef_col_varchar() {
		return ref_col_varchar;
	}

	public void setRef_col_varchar(String ref_col_varchar) {
		this.ref_col_varchar = ref_col_varchar;
	}

	public String getRef_col_other() {
		return ref_col_other;
	}

	public void setRef_col_other(String ref_col_other) {
		this.ref_col_other = ref_col_other;
	}

	public long getCreated_by() {
		return created_by;
	}

	public void setCreated_by(long created_by) {
		this.created_by = created_by;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public long getCreated_by_post() {
		return created_by_post;
	}

	public void setCreated_by_post(long created_by_post) {
		this.created_by_post = created_by_post;
	}

	public long getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(long updated_by) {
		this.updated_by = updated_by;
	}

	public LocalDateTime getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(LocalDateTime updated_date) {
		this.updated_date = updated_date;
	}

	public long getUpdated_by_post() {
		return updated_by_post;
	}

	public void setUpdated_by_post(long updated_by_post) {
		this.updated_by_post = updated_by_post;
	}

	public short getActive_status() {
		return active_status;
	}

	public void setActive_status(short active_status) {
		this.active_status = active_status;
	}

}
