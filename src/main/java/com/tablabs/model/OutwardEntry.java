package com.tablabs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TDOI_OUTWARD_ENTRY", schema = "DOI")
public class OutwardEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "outward_id")
	long outwardId;

	@Column(name = "outward_no")
	long outwardNo;

	@Column(name = "outward_dt")
	LocalDate outwardDate;

	@Column(name = "letter_type_id")
	long letterTypeId;

	@Column(name = "letter_type")
	String letterType;

	@Column(name = "inward_letter_no")
	String inwardLetterNo;

	@Column(name = "letter_details")
	String letterDetails;

	@Column(name = "sent_to_details")
	String sentToDetails;

	@Column(name = "frm_branch_id")
	long frmBranchId;

	@Column(name = "outward_mode_id")
	long outwardModeId;

	@Column(name = "outward_amt")
	double outwardAmount;

	@Column(name = "remarks")
	String remarks;

	@Column(name = "reference_no")
	String referenceNo;

	@Column(name = "reference_dt")
	LocalDateTime referenceDate;

	@Column(name = "active_status")
	int activeStatus;

	@Column(name = "created_date")
	LocalDateTime createdDate;

	@Column(name = "created_by")
	long createdBy;

	@Column(name = "created_by_post")
	long createdByPost;

	@Column(name = "updated_date")
	LocalDateTime updatedDate;

	@Column(name = "updated_by")
	long updatedBy;

	@Column(name = "updated_by_post")
	long updatedByPost;

	public OutwardEntry() {
		super();
	}

	public OutwardEntry(long outwardId, long outwardNo, LocalDate outwardDate, long letterTypeId, String letterType,
			String inwardLetterNo, String letterDetails, String sentToDetails, long frmBranchId, long outwardModeId,
			double outwardAmount, String remarks, String referenceNo, LocalDateTime referenceDate, int activeStatus,
			LocalDateTime createdDate, long createdBy, long createdByPost, LocalDateTime updatedDate, long updatedBy,
			long updatedByPost) {
		super();
		this.outwardId = outwardId;
		this.outwardNo = outwardNo;
		this.outwardDate = outwardDate;
		this.letterTypeId = letterTypeId;
		this.letterType = letterType;
		this.inwardLetterNo = inwardLetterNo;
		this.letterDetails = letterDetails;
		this.sentToDetails = sentToDetails;
		this.frmBranchId = frmBranchId;
		this.outwardModeId = outwardModeId;
		this.outwardAmount = outwardAmount;
		this.remarks = remarks;
		this.referenceNo = referenceNo;
		this.referenceDate = referenceDate;
		this.activeStatus = activeStatus;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.createdByPost = createdByPost;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
		this.updatedByPost = updatedByPost;
	}

	public long getOutwardId() {
		return outwardId;
	}

	public void setOutwardId(long outwardId) {
		this.outwardId = outwardId;
	}

	public long getOutwardNo() {
		return outwardNo;
	}

	public void setOutwardNo(long outwardNo) {
		this.outwardNo = outwardNo;
	}

	public LocalDate getOutwardDate() {
		return outwardDate;
	}

	public void setOutwardDate(LocalDate outwardDate) {
		this.outwardDate = outwardDate;
	}

	public long getLetterTypeId() {
		return letterTypeId;
	}

	public void setLetterTypeId(long letterTypeId) {
		this.letterTypeId = letterTypeId;
	}

	public String getLetterType() {
		return letterType;
	}

	public void setLetterType(String letterType) {
		this.letterType = letterType;
	}

	public String getInwardLetterNo() {
		return inwardLetterNo;
	}

	public void setInwardLetterNo(String inwardLetterNo) {
		this.inwardLetterNo = inwardLetterNo;
	}

	public String getLetterDetails() {
		return letterDetails;
	}

	public void setLetterDetails(String letterDetails) {
		this.letterDetails = letterDetails;
	}

	public String getSentToDetails() {
		return sentToDetails;
	}

	public void setSentToDetails(String sentToDetails) {
		this.sentToDetails = sentToDetails;
	}

	public long getFrmBranchId() {
		return frmBranchId;
	}

	public void setFrmBranchId(long frmBranchId) {
		this.frmBranchId = frmBranchId;
	}

	public long getOutwardModeId() {
		return outwardModeId;
	}

	public void setOutwardModeId(long outwardModeId) {
		this.outwardModeId = outwardModeId;
	}

	public double getOutwardAmount() {
		return outwardAmount;
	}

	public void setOutwardAmount(double outwardAmount) {
		this.outwardAmount = outwardAmount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public LocalDateTime getReferenceDate() {
		return referenceDate;
	}

	public void setReferenceDate(LocalDateTime referenceDate) {
		this.referenceDate = referenceDate;
	}

	public int getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public long getCreatedByPost() {
		return createdByPost;
	}

	public void setCreatedByPost(long createdByPost) {
		this.createdByPost = createdByPost;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public long getUpdatedByPost() {
		return updatedByPost;
	}

	public void setUpdatedByPost(long updatedByPost) {
		this.updatedByPost = updatedByPost;
	}

}
